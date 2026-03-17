package method_level1;

import java.util.Scanner;

public class TrigFunction {
    public double[] calc(double d) {
        double r = Math.toRadians(d);
        return new double[]{Math.sin(r), Math.cos(r), Math.tan(r)};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        TrigFunction obj = new TrigFunction();
        double[] r = obj.calc(d);
        System.out.println(r[0] + " " + r[1] + " " + r[2]);
    }
}

