public class CompanyLocation {
    public static void main(String[] args) {
         if (args.length != 2) {
            System.out.println("Error: Please provide exactly two command line arguments.");
            return;
        }
        String comp =args[0];
        String loc =args[1];
        System.out.println(comp + " Technologies "+loc);
    }
}