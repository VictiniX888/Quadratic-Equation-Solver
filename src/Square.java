public class Square {

    public double x1;
    public double x2;

    public Square(double a, double b, double c) {

        if(Math.sqrt(a) != Math.floor(Math.sqrt(a))) {
            b /= a;
            c /= a;
            a /= a;
        }

        double a0 = Math.sqrt(a);
        double b0 = b / a0 / 2;
        double rhs1 = Math.sqrt(-c + Math.pow(b0, 2));
        double rhs2 = -rhs1;

        x1 = (rhs1 + (-b0)) / a0;
        x2 = (rhs2 + (-b0)) / a0;
    }
}
