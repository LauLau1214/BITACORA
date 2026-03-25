package dosw.bitacora.corte1.semana3.Adapter.GasPump;

import dosw.bitacora.corte1.semana3.Adapter.FuelService.FuelService;

public class GasPump implements FuelService {

    @Override
    public void supply(int liters) {
        System.out.println("Suministrando" + liters + "litros de gasonlina");
    }

}
