public class FindPassword {

    public static boolean isStable(int number) {
        int[] freq = new int[10];
        String s = String.valueOf(number);

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - '0']++;
        }

        int common = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                if (common == 0) {
                    common = freq[i];
                } else if (freq[i] != common) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int findPassword(int... numbers) {
        int stableSum = 0, unstableSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (isStable(numbers[i])) {
                stableSum += numbers[i];
            } else {
                unstableSum += numbers[i];
            }
        }
        return stableSum - unstableSum;
    }

    public static void main(String[] args) {
        int password = findPassword(12, 1313, 122, 678, 898);
        System.out.println("The password is: " + password);
    }
}
