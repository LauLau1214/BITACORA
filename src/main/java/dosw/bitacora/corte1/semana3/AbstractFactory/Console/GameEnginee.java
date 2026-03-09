package dosw.bitacora.corte1.semana3.AbstractFactory.Console;

import dosw.bitacora.semana3.AbstractFactory.Controller.Controller;
import dosw.bitacora.semana3.AbstractFactory.Game.Game;
import dosw.bitacora.semana3.AbstractFactory.UI.UI;

public class GameEnginee {
    private Controller controller;
    private Game game;
    private UI ui;

    public GameEnginee(ConsoleFactory factory){
        controller = factory.createController();
        game = factory.createGame();
        ui = factory.createUI();
    }

    public void run(){
        controller.connect();
        game.start();
        ui.render();
    }
}
