package dosw.bitacora.corte1.semana2.solid;

public class Calculator {

    public double execute(Operation operation, double a, double b) {
        return operation.calculate(a, b);
    }
}
