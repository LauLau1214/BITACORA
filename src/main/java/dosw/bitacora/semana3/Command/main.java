package dosw.bitacora.semana3.Command;

import java.util.List;

public class main {

    public static void main(String[] args) {

        GameCharacter character = new GameCharacter();
        GameController controller = new GameController();

        List<Command> actions = List.of(
                new WalkCommand(character),
                new JumpCommand(character),
                new AttackCommand(character),
                new DefendCommand(character)
        );

        actions.forEach(controller::pressButton);
    }
}
