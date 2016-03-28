import java.text.DecimalFormat;
import java.util.Scanner;

public class Solve {

    public Solve() {

        double[] coeff = new double[3];

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("a: ");
            if(scanner.hasNext("stop") || scanner.hasNext("Stop")) {
                break;
            }
            coeff[0] = scanner.nextInt();
            if(coeff[0] == 0) {
                System.out.println("Not a quadratic equation");
            }
            System.out.print("b: ");
            coeff[1] = scanner.nextInt();
            System.out.print("c: ");
            coeff[2] = scanner.nextInt();

            double a1;
            double a2;
            double c1;
            double c2;
            double x1;
            double x2;

            if(Math.signum(coeff[0]) == -1) {
                for (int i = 0; i < 3; i++) {
                    if(coeff[i] != 0) {
                        coeff[i] = -coeff[i];
                    }
                }
            }

            Factorise factorise = new Factorise(coeff[0], coeff[1], coeff[2]);
            a1 = factorise.a1;
            a2 = factorise.a2;
            c1 = factorise.c1;
            c2 = factorise.c2;

            if (c1 != 0) {
                c1 *= -1;
            }
            if (c2 != 0) {
                c2 *= -1;
            }

            x1 = c1 / a1;
            x2 = c2 / a2;

            DecimalFormat decimalFormat = new DecimalFormat();

            if(x1 == x2) {
                System.out.println("x=" + decimalFormat.format(x1));
            }
            else {
                System.out.println("x={" + decimalFormat.format(x1) + "," + decimalFormat.format(x2) + "}");
            }
        }
    }
}
