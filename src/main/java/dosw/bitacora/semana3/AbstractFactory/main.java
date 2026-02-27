package dosw.bitacora.semana3.AbstractFactory;

import dosw.bitacora.semana3.AbstractFactory.Console.ConsoleFactory;
import dosw.bitacora.semana3.AbstractFactory.Console.GameEnginee;
import dosw.bitacora.semana3.AbstractFactory.Console.PlayStationFactory;
import dosw.bitacora.semana3.AbstractFactory.Console.XboxFactory;

public class main {
    public static void main(String[] args) {

        ConsoleFactory factory;

        factory = new PlayStationFactory();
        GameEnginee psEngine = new GameEnginee(factory);
        psEngine.run();

        System.out.println(" ---- ");

        factory = new XboxFactory();
        GameEnginee xboxEngine = new GameEnginee(factory);
        xboxEngine.run();
    }
}
