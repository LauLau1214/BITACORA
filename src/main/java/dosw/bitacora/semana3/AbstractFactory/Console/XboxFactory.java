package dosw.bitacora.semana3.AbstractFactory.Console;

import dosw.bitacora.semana3.AbstractFactory.Controller.Controller;
import dosw.bitacora.semana3.AbstractFactory.Controller.XboxController;
import dosw.bitacora.semana3.AbstractFactory.Game.Game;
import dosw.bitacora.semana3.AbstractFactory.Game.XboxGame;
import dosw.bitacora.semana3.AbstractFactory.UI.UI;
import dosw.bitacora.semana3.AbstractFactory.UI.XboxUI;

public class XboxFactory implements ConsoleFactory {

    @Override
    public Controller createController() {
        return new XboxController();
    }

    @Override
    public Game createGame(){
        return new XboxGame();
    }

    @Override
    public UI createUI(){
        return new XboxUI();
    }
}
