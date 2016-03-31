public class QuadraticFormula {

    public double x1;
    public double x2;

    public QuadraticFormula(double a, double b, double c) {

        x1 = (-b + -Math.sqrt(Math.pow(b, 2) + -4*a*c)) / (2*a);
        x2 = (-b + Math.sqrt(Math.pow(b, 2) + -4*a*c)) / (2*a);
    }
}
