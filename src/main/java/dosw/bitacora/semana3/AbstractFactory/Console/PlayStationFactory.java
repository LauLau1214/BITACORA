package dosw.bitacora.semana3.AbstractFactory.Console;

import dosw.bitacora.semana3.AbstractFactory.Controller.Controller;
import dosw.bitacora.semana3.AbstractFactory.Controller.PlayStationController;
import dosw.bitacora.semana3.AbstractFactory.Game.Game;
import dosw.bitacora.semana3.AbstractFactory.Game.PlayStationGame;
import dosw.bitacora.semana3.AbstractFactory.UI.PlayStationUI;
import dosw.bitacora.semana3.AbstractFactory.UI.UI;

public class PlayStationFactory implements ConsoleFactory {

    @Override
    public Controller createController() {
        return new PlayStationController();
    }

    @Override
    public Game createGame(){
        return new PlayStationGame();
    }

    @Override
    public UI createUI(){
        return new PlayStationUI();
    }


}
