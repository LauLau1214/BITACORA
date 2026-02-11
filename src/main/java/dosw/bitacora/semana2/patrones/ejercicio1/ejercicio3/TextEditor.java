package dosw.bitacora.semana2.patrones.ejercicio1.ejercicio3;

public class TextEditor {

    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    // Crear Memento
    public Memento save() {
        return new Memento(content);
    }

    // Restaurar Memento
    public void restore(Memento memento) {
        this.content = memento.getState();
    }
}
