import java.util.Scanner;

public class Main {

    // Factorial helper
    public static class MyFactorial {
        public static float factorial(int n) {   // use int instead of float for loop correctness
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        // Exercise 1
        System.out.print("Enter 1 number: ");
        float number_1 = myObj.nextFloat();
        System.out.print("Enter 2 number: ");
        float number_2 = myObj.nextFloat();
        System.out.println("Number are equal is: " + (number_1 == number_2));

        // Exercise 2
        System.out.println("=== Division part ===");
        System.out.print("Enter 1 number: ");
        float number_3 = myObj.nextFloat();
        System.out.print("Enter 2 number: ");
        float number_4 = myObj.nextFloat();

        int counter = 0;
        while (number_3 >= number_4) {
            counter++;
            number_3 = number_3 - number_4;
        }
        System.out.printf("After kinda int division we got: %s%n", counter);

        // Exercise 3
        System.out.println("=== Multiplication part ===");
        System.out.print("Enter 1 number: ");
        int number_5 = myObj.nextInt();
        System.out.print("Enter 2 number: ");
        int number_6 = myObj.nextInt();

        boolean here_minus = false;
        if (number_5 < 0 && number_6 < 0) {
            number_5 *= -1;
            number_6 *= -1;
        } else if (number_6 < 0) {
            here_minus = true;
            number_6 *= -1;
        }
        int multiplication_num = number_5;
        System.out.print("Minus - ");
        System.out.println(here_minus);
        for (int i = 0; i < number_6 - 1; i++) {
            number_5 += multiplication_num;
        }
        if (here_minus){
            number_5 *= -1;
        }
        System.out.printf("After kinda int multiplication we got: %s%n", number_5);

        // Exercise 4
        System.out.println("=== Series sum part ===");
        System.out.print("Enter amount of cycles: ");
        int N = myObj.nextInt();
        float result_number = 0;
        for (int n = 1; n <= N; n++) {
            result_number += ((float) Math.pow(3, n) * MyFactorial.factorial(n)) / (float) Math.pow(n, n);
        }
        System.out.printf("After summa multiplication we got: %s%n", result_number);
    }
}
// test chabge
