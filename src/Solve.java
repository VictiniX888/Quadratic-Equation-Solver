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

            double x1;
            double x2;

            if(Math.signum(coeff[0]) == -1) {
                for (int i = 0; i < 3; i++) {
                    if(coeff[i] != 0) {
                        coeff[i] = -coeff[i];
                    }
                }
            }

            QuadraticFormula formula = new QuadraticFormula(coeff[0], coeff[1], coeff[2]);
            x1 = formula.x1;
            x2 = formula.x2;

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
