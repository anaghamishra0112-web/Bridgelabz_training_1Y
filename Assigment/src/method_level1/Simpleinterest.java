
package method_level1;

import java.util.Scanner;

public class Simpleinterest {
    public static double calculateSi(double principle, double rate, double time) {
        double simpleInterest = principle * rate * time / 100;
        return simpleInterest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principle");
        double principle = sc.nextDouble();

        System.out.println("Enter rate");
        double rate = sc.nextDouble();

        System.out.println("Enter time");
        double time = sc.nextDouble();

        double simpleInterest = calculateSi(principle, rate, time);

        System.out.println("The Simple Interest is " + simpleInterest +
                " for Principal " + principle +
                ", Rate of Interest " + rate +
                " and Time " + time);
    }
}