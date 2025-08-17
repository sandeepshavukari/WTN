public class InsertString {
    public static void main(String[] args) {
        String original = "Hello World";
        String toInsert = "Beautiful ";
        int position = 6; 
        StringBuilder sb = new StringBuilder(original);
        sb.insert(position, toInsert);
        System.out.println(sb.toString());
    }
}
