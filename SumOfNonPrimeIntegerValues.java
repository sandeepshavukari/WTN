import java.util.Scanner;

public class SumOfNonPrimeIntegerValues {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int sumNonPrimes(int ar[],int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (!isPrime(i)) {
                sum += ar[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();   
        
        }
        System.out.println(sumNonPrimes(ar,n));
        
    }

    
}