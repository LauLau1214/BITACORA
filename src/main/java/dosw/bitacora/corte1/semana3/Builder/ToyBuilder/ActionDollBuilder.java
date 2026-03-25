package dosw.bitacora.corte1.semana3.Builder.ToyBuilder;

import dosw.bitacora.corte1.semana3.Builder.Toy.ToyDoll;

public class ActionDollBuilder implements ToyDollBuilder{

    private ToyDoll doll;

    public ActionDollBuilder(){
        doll = new ToyDoll();
    }

    @Override
    public void buildHead() {
        doll.setHead("Cabeza de villano");
    }

    @Override
    public void buildBody() {
        doll.setBody("Cuerpo fuerte");
    }

    @Override
    public void buildArms() {
        doll.setArms("Brazos fuertes");
    }

    @Override
    public void buildLegs() {
        doll.setLegs("Piernas fuertes");
    }

    @Override
    public void addAccesories() {
        doll.setHasAccessories(true);
    }

    public ToyDoll getResult(){
        return doll;
    }
}
