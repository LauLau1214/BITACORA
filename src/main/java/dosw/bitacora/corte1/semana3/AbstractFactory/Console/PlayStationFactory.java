package dosw.bitacora.corte1.semana3.AbstractFactory.Console;

import dosw.bitacora.corte1.semana3.AbstractFactory.Controller.*;
import dosw.bitacora.corte1.semana3.AbstractFactory.Game.Game;
import dosw.bitacora.corte1.semana3.AbstractFactory.Game.PlayStationGame;
import dosw.bitacora.corte1.semana3.AbstractFactory.UI.PlayStationUI;
import dosw.bitacora.corte1.semana3.AbstractFactory.UI.UI;


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
