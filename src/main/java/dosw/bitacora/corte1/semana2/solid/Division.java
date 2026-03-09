package dosw.bitacora.corte1.semana2.solid;

public class Division implements Operation {

    @Override
    public double calculate(double a, double b) {

        if (b == 0) {
            System.out.println("No se puede dividir por cero");
            return 0;
        }

        return a / b;
    }
}
