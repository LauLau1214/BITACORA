package dosw.bitacora.semana3.Builder;

import dosw.bitacora.semana3.Builder.Toy.ToyDoll;
import dosw.bitacora.semana3.Builder.Toy.ToyFactory;
import dosw.bitacora.semana3.Builder.ToyBuilder.ActionDollBuilder;
import dosw.bitacora.semana3.Builder.ToyBuilder.ClassicDollBuilder;

public class main {
    public static void main(String[] args) {

        ToyFactory factory = new ToyFactory();

        ActionDollBuilder actionBuilder = new ActionDollBuilder();
        factory.constructDoll(actionBuilder);
        ToyDoll actionDoll = actionBuilder.getResult();

        ClassicDollBuilder classicBuilder = new ClassicDollBuilder();
        factory.constructDoll(classicBuilder);
        ToyDoll classicDoll = classicBuilder.getResult();

        actionDoll.showInfo();
        classicDoll.showInfo();
    }
}
