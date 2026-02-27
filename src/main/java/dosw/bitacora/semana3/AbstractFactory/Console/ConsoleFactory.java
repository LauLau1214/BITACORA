package dosw.bitacora.semana3.AbstractFactory.Console;

import dosw.bitacora.semana3.AbstractFactory.Controller.Controller;
import dosw.bitacora.semana3.AbstractFactory.Game.Game;
import dosw.bitacora.semana3.AbstractFactory.UI.UI;

public interface ConsoleFactory {

    public Controller createController();
    public Game createGame();
    public UI createUI();
}
