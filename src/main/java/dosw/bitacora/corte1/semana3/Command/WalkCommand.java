package dosw.bitacora.corte1.semana3.Command;

public class WalkCommand implements Command {

    private GameCharacter character;

    public WalkCommand(GameCharacter character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.walk();
    }
}
