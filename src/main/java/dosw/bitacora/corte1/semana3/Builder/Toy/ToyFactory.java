package dosw.bitacora.corte1.semana3.Builder.Toy;

import dosw.bitacora.corte1.semana3.Builder.ToyBuilder.ClassicDollBuilder;
import dosw.bitacora.corte1.semana3.Builder.ToyBuilder.ToyDollBuilder;

public class ToyFactory {

    public ToyDollBuilder builder;

    public void constructDoll(ClassicDollBuilder builder){

        builder.buildHead();
        builder.buildBody();
        builder.buildLegs();
        builder.buildArms();
        builder.addAccesories();

    }
}
