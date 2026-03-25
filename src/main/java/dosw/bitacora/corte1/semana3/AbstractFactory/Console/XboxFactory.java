package dosw.bitacora.corte1.semana3.AbstractFactory.Console;

import dosw.bitacora.corte1.semana3.AbstractFactory.Controller.*;
import dosw.bitacora.corte1.semana3.AbstractFactory.Game.Game;
import dosw.bitacora.corte1.semana3.AbstractFactory.Game.XboxGame;
import dosw.bitacora.corte1.semana3.AbstractFactory.UI.UI;
import dosw.bitacora.corte1.semana3.AbstractFactory.UI.XboxUI;


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
