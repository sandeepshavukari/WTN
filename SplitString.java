public class SplitString {
    public static void main(String[] args) {
        String str = "apple banana cherry";
        String[] parts = str.split(" ");
        System.out.println("Split parts:");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
