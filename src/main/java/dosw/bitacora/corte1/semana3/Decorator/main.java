package dosw.bitacora.corte1.semana3.Decorator;

import dosw.bitacora.semana3.Decorator.Barco.*;
import dosw.bitacora.semana3.Decorator.BarcoDecorator.*;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Function;

public class main {

    public static void main(String[] args) {

        Barco barcoBase = new BarcoBase();

        Map<String, Function<Barco, Barco>> mejoras = new HashMap<>();

        mejoras.put("BLINDAJE", BlindajeDecorador::new);
        mejoras.put("RADAR", RadarDecorador::new);
        mejoras.put("MISILES", MisilesDecorador::new);
        mejoras.put("ANTITORPEDOS", AntiTorpedosDecorador::new);

        List<String> configuracion = List.of(
                "BLINDAJE",
                "RADAR",
                "MISILES"
        );

        Barco barcoFinal = barcoBase;

        for (String mejora : configuracion) {
            barcoFinal = mejoras.get(mejora).apply(barcoFinal);
        }

        System.out.println(barcoFinal.getDescripcion());
        System.out.println("Ataque: " + barcoFinal.poderAtaque());
        System.out.println("Defensa: " + barcoFinal.defensa());
    }
}
