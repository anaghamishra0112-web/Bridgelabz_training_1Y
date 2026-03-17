package method_level2;

import java.util.Scanner;

public class VoteChecker {
    public boolean canStudentVote(int a) {
        if (a < 0) return false;
        return a >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        VoteChecker obj = new VoteChecker();
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            System.out.println(obj.canStudentVote(a[i]));
        }
    }
}
