
public class Main {
    public static void main(String[] args) {
        try {
            Strings base = new Strings("JavaOOP");
            UpperCaseStrings upper = new UpperCaseStrings("helloWorld");
            LowerCaseStrings lower = new LowerCaseStrings("Programming");

            System.out.println("Base string length: " + base.getLength());
            System.out.println("Upper string length: " + upper.getLength());
            System.out.println("Lower string length: " + lower.getLength());
            System.out.println();

            System.out.println("Base sort: " + base.sort());
            System.out.println("Upper sort (ascending): " + upper.sort());
            System.out.println("Lower sort (descending): " + lower.sort());

        } catch (IllegalArgumentException e) {
            System.out.println("Argument error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unknown error: " + e.getMessage());
        }
    }
}