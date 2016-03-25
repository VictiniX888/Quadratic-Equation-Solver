public class Factorise {

    public double a1 = 0;
    public double a2 = 0;
    public double c0 = 0;
    public double c1 = 0;
    public double c2 = 0;

    public Factorise(double a, double b, double c) {

        pants:
        for (a1 = 1; a1 <= a; a1++) {
            if(a % a1 == 0) {
                a2 = a / a1;
                if(c < 0) {
                    c0 = c * -1;
                }
                else {
                    c0 = c;
                }
                if(c == 0) {
                    c1 = 0;
                    c2 = b;
                    break;
                }
                else {
                    for (c1 = 1; c1 <= c0; c1++) {
                        if (c % c1 == 0) {
                            c2 = c / c1;
                            if (b >= 0 && c >= 0 && a1 * c2 + c1 * a2 == b) {
                                break pants;
                            } else if (b < 0 && a1 * -c2 + -c1 * a2 == b) {
                                c1 *= -1;
                                c2 *= -1;
                                break pants;
                            } else if (c < 0) {
                                if (a1 * c2 + c1 * a2 == b) {
                                    break pants;
                                }
                                if (a1 * -c2 + -c1 * a2 == b) {
                                    c1 *= -1;
                                    c2 *= -1;
                                    break pants;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
