package dosw.bitacora.semana3.Builder.Toy;

import dosw.bitacora.semana3.Builder.ToyBuilder.ToyDollBuilder;

public class ToyFactory {

    public ToyDollBuilder builder;

    public void constructDoll(ToyDollBuilder builder){

        builder.buildHead();
        builder.buildBody();
        builder.buildLegs();
        builder.buildArms();
        builder.addAccesories();

    }
}
