package dosw.bitacora.corte1.semana3.AbstractFactory.Console;

import dosw.bitacora.corte1.semana3.AbstractFactory.Controller.*;
import dosw.bitacora.corte1.semana3.AbstractFactory.Game.Game;
import dosw.bitacora.corte1.semana3.AbstractFactory.UI.UI;

public interface ConsoleFactory {

    public Controller createController();
    public Game createGame();
    public UI createUI();
}
