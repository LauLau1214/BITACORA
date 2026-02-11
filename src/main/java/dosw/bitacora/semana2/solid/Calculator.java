package dosw.bitacora.semana2.solid;

public class Calculator {

    public double execute(Operation operation, double a, double b) {
        return operation.calculate(a, b);
    }
}
