package dosw.bitacora.semana2.patrones.ejercicio3;


//Ejercicio 3 – Patrón de Comportamiento (Memento)
//Contexto:
//Un editor sencillo permite modificar el contenido de un texto, pero se quiere agregar la opción de deshacer cambios.
//Enunciado:
//Diseñe un sistema que permita guardar el estado de un texto antes de ser modificado y restaurarlo cuando el usuario lo solicite.
//El sistema debe permitir:
//Guardar el estado actual del texto en una estructura de datos (lista)
//Restaurar un estado anterior sin exponer los detalles internos del objeto que contiene el texto.
//El historial de estados debe manejarse sin violar el encapsulamiento del objeto principal.
//Restricciones:
//Aplique encapsulamiento para proteger el estado interno.
//Use el patrón Memento para almacenar y restaurar estados.
//El objeto que guarda los estados no debe modificar directamente el contenido del texto.
//El diseño debe permitir múltiples estados guardados.


public class main {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor();
        History history = new History();

        editor.setContent("Hola");
        history.add(editor.save());

        editor.setContent("Hola mundo");
        history.add(editor.save());

        editor.setContent("Hola mundo desde patrones");

        System.out.println("Actual: " + editor.getContent());

        // Restaurar estado anterior
        editor.restore(history.get(1));
        System.out.println("Después de deshacer: " + editor.getContent());

        editor.restore(history.get(0));
        System.out.println("Deshacer otra vez: " + editor.getContent());
    }
}
