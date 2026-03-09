package dosw.bitacora.corte1.semana3.Adapter;

import dosw.bitacora.semana3.Adapter.FuelService.*;
import dosw.bitacora.semana3.Adapter.GasPump.GasPump;

public class SmartGasStation {
    public static void main(String[] args) {

        // Bomba tradicional de gasolina
        FuelService gasolinePump = new GasPump();

        // Cargador eléctrico rápido (usando Adapter)
        FuelService fastElectricPump =
                new FastChargerAdapter(new FastElectricCharger());

        // Cargador eléctrico lento (usando Adapter)
        FuelService slowElectricPump =
                new SlowChargerAdapter(new SlowElectricCharger());

        System.out.println("---- Abastecimiento ----");

        gasolinePump.supply(30);
        fastElectricPump.supply(30);
        slowElectricPump.supply(30);
    }
}
