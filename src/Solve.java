import java.text.DecimalFormat;
import java.util.Scanner;

public class Solve {

    public Solve() {

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("a: ");
            if(scanner.hasNext("stop") || scanner.hasNext("Stop")) {
                break;
            }
            double a = scanner.nextInt();
            System.out.print("b: ");
            double b = scanner.nextInt();
            System.out.print("c: ");
            double c = scanner.nextInt();

            double a1 = 0;
            double a2 = 0;
            double c1 = 0;
            double c2 = 0;
            double x1 = 0;
            double x2 = 0;

            Factorise factorise = new Factorise(a, b, c);
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

            System.out.println("x={" + decimalFormat.format(x1) + "," + decimalFormat.format(x2) + "}");
        }
    }
}
