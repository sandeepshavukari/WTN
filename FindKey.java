import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class FindKey {
    public static List<Integer> findFirstSecondLargest(int a) {
        List<Integer> digits = new ArrayList<>();
        while (a > 0) {
            digits.add(a % 10);
            a /= 10;
        }
        Collections.sort(digits);
        int n = digits.size();
        List<Integer> result = new ArrayList<>();
        result.add(digits.get(n - 1));
        result.add(digits.get(n - 2));
        return result;
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int[] ar = {a, b, c};
        int max = 0;
        int smax = 0;

        for (int i = 0; i < ar.length; i++) {
            List<Integer> li = findFirstSecondLargest(ar[i]);
            max += li.get(0);
            smax += li.get(1);
        }

        System.out.println("Key : " + (max + smax));
        //umgy njzi wejw jyf
    }
}