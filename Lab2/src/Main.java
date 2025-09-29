import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static String deleteBetweenAllDigits(String text) {
        StringBuilder result = new StringBuilder();
        int lastDigitIndex = -1;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isDigit(c)) {
                if (lastDigitIndex != -1 && lastDigitIndex != i - 1) {
                    result.setLength(lastDigitIndex + 1); // truncate to last digit
                }
                lastDigitIndex = result.length(); // new last digit position in result
            }

            result.append(c);
        }

        return result.toString();
    }

        public static void main (String[]args){
            Scanner myObj = new Scanner(System.in);
            System.out.print("Enter a string surrounded with two numbers: ");
            String var = myObj.next();

            String result = deleteBetweenAllDigits(var);
            System.out.println(result);
        }
    }