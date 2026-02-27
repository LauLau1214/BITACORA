package dosw.bitacora.semana3.Builder.ToyBuilder;

import dosw.bitacora.semana3.Builder.Toy.ToyDoll;

public class ClassicDollBuilder implements ToyDollBuilder {

    private ToyDoll doll;

    public ClassicDollBuilder() {
        doll = new ToyDoll();
    }

    @Override
    public void buildHead() {
        doll.setHead("Cabeza muñeca");
    }

    @Override
    public void buildBody() {
        doll.setBody("Cuerpo muñeca");
    }

    @Override
    public void buildArms() {
        doll.setArms("Brazos de muñeca");
    }

    @Override
    public void buildLegs() {
        doll.setLegs("Piernas de muñeca");
    }

    @Override
    public void addAccesories() {
        doll.setHasAccessories(false);
    }

    public ToyDoll getResult(){
        return doll;
    }
}
