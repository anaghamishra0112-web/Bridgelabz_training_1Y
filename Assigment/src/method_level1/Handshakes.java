package method_level1;

import java.util.Scanner;

public class Handshakes {
    public int calc(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Handshakes obj = new Handshakes();
        System.out.println(obj.calc(n));
    }
}
