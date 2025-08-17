import java.util.*;

public class PasswordFinder {

    public static int findPassword(int[] ns) {
        int st = 0, us = 0;
        for (int n = 0; n < ns.length; n++) {
            if (isst(ns[n])) {
                st++;
            } else {
                us++;
            }
        }
        return (us * 10) + st;
    }
    private static boolean isst(int n) {
        if (n == 0) {
            return true;
        }
        int[] fre = new int[10]; 
        while (n > 0) {
            int a = n % 10;
            fre[a]++;
            n /= 10;
        }
        int ef = 0;
        for (int c = 0; c < fre.length; c++) {
            if (fre[c] > 0) {
                if (ef == 0) {
                    ef = fre[c];
                } else if (ef != fre[c]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[5];
        System.out.println("Enter 5 nbers:");
        for (int i = 0; i < 5; i++) {
            ar[i] = sc.nextInt();
        }
        int pwd = findPassword(ar);
        System.out.println("Password: " + pwd);
    }
}