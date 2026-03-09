package dosw.bitacora.corte1.semana2.solid;


// Ejercicio 4 – Principios SOLID (Calculadora simple)
//Contexto:
//Se desea construir una calculadora básica, pero bien diseñada.
//Enunciado:
//Implemente una calculadora que pueda realizar las siguientes operaciones:
//Suma de numeros enteros y de numeros decimales
//Resta de numeros enteros y de numeros decimales
//Multiplicación de numeros enteros y de numeros decimales
//División de numeros enteros y de numeros decimales
//Cada operación debe estar separada de la calculadora principal, de manera que agregar una nueva operación no implique modificar el código existente.
//Objetivo SOLID:
//Aplicar Responsabilidad Única (cada operación hace solo una cosa).
//Aplicar Abierto/Cerrado (agregar operaciones sin modificar la calculadora).
//Usar interfaces para representar las operaciones (Liskov substitution e Interface Segregation)


public class main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Operation add = new Addition();
        Operation sub = new Subtraction();
        Operation mul = new Multiplication();
        Operation div = new Division();

        System.out.println("Suma: " + calculator.execute(add, 5, 3));
        System.out.println("Resta: " + calculator.execute(sub, 5.5, 2.2));
        System.out.println("Multiplicación: " + calculator.execute(mul, 4, 2));
        System.out.println("División: " + calculator.execute(div, 10, 2));
    }
}
