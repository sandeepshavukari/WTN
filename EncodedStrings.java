import java.util.Arrays;
import java.lang.StringBuilder;

public class EncodedStrings {

    public static String[] splitString(String str) {
        int length = str.length();
        String front, middle, end;
        int partLength = length / 3;
        int remainder = length % 3;

        if (remainder == 0) {
            front = str.substring(0, partLength);
            middle = str.substring(partLength, 2 * partLength);
            end = str.substring(2 * partLength, length);
        }
        else if (remainder == 1) {
            front = str.substring(0, partLength);
            middle = str.substring(partLength, 2 * partLength + 1);
            end = str.substring(2 * partLength + 1, length);
        }
        else {
            front = str.substring(0, partLength + 1);
            middle = str.substring(partLength + 1, 2 * partLength + 1);
            end = str.substring(2 * partLength + 1, length);
        }

        return new String[]{front, middle, end};
    }

    public static void main(String[] args) {
        String input1 = "John";
        String input2 = "Johny";
        String input3 = "Janardhan";

        String[] parts1 = splitString(input1);
        String[] parts2 = splitString(input2);
        String[] parts3 = splitString(input3);

        System.out.println("Splitting of strings:");
        System.out.println("Input 1 parts: " + Arrays.toString(parts1));
        System.out.println("Input 2 parts: " + Arrays.toString(parts2));
        System.out.println("Input 3 parts: " + Arrays.toString(parts3));
        System.out.println();
        
        String output1 = parts1[0] + parts2[1] + parts3[2];
        String output2 = parts1[1] + parts2[2] + parts3[0];
        String output3 = parts1[2] + parts2[0] + parts3[1];
        
        System.out.println("Concatenated strings:");
        System.out.println("Output 1: " + output1);
        System.out.println("Output 2: " + output2);
        System.out.println("Output 3: " + output3);
        System.out.println();

        StringBuilder toggledOutput3 = new StringBuilder();
        for (char ch : output3.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                toggledOutput3.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggledOutput3.append(Character.toUpperCase(ch));
            } else {
                toggledOutput3.append(ch);
            }
        }
        String finalOutput3 = toggledOutput3.toString();
        
        System.out.println("Final Results:");
        System.out.println("Final Output 1: " + output1);
        System.out.println("Final Output 2: " + output2);
        System.out.println("Final Output 3: " + finalOutput3);
    }
}
