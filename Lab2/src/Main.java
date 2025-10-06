import java.util.Scanner;

// File iteration
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// New types
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static Map<String, Integer> readFromFile(String filename){
        Map<String, Integer> dictionary = new HashMap<>();

        File myFile = new File(filename);
        try (Scanner myReader = new Scanner(myFile)) {
            while (myReader.hasNextLine()) {
                String newData = myReader.nextLine();
                String[] splitedData = newData.split("=");
                dictionary.put(splitedData[0], Integer.parseInt(splitedData[1]));
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return dictionary;
        }
        return dictionary;
    }
    public static void writeMatrixToFile(String filename, int[][] matrix) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (int[] row : matrix) {
                for (int value : row) {
                    writer.write(value + " ");
                }
                writer.write("\n"); // new line after each row
            }
            System.out.println("Matrix successfully written to " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while writing the matrix.");
            e.printStackTrace();
        }
    }
    public static void printMatrix(int[][] matrix){
        for (int[] row : matrix) { // Outer loop: iterates through each row (which is an array of ints)
            for (int element : row) { // Inner loop: iterates through each element in the current row
                System.out.print(element + " ");
            }
            System.out.println(); // Move to the next line after printing a row
        }
    }
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
        if (lastDigitIndex == -1){
            System.out.println("The str doesn`t contain any numbers");
        }
        return result.toString();
    }

        public static void main (String[]args){
            Scanner myObj = new Scanner(System.in);
            System.out.print("Enter a string surrounded with two numbers: ");
            String var = myObj.next();

            String result = deleteBetweenAllDigits(var);
            System.out.println(result);

            // Exercise 2 ==========================

            final String inputNameFile = "input.txt";
            final String outputNameFile = "output.txt";

            Map<String, Integer> savedData = readFromFile(inputNameFile);
            int rows = savedData.getOrDefault("m", 0);
            int columns = savedData.getOrDefault("n", 0);

            System.out.printf("Number of rows - %d%n", rows);
            System.out.printf("Number of columns - %d%n", columns);
            if (rows == 0 || columns == 0){
                System.out.println("m or n is 0, can,`t maka a matrix");
            } else{

                int column_sort_by = 0;
                boolean validInput = false;
                while (!validInput) {
                    try {
                        System.out.print("Enter a column by what a matrix will be sorted: ");
                        column_sort_by = myObj.nextInt();
                        if (column_sort_by >= columns || column_sort_by < 0){
                            throw new NumberFormatException();
                        }
                        validInput = true;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input! Please enter a valid column integer, must be lower than columns.");
                    }
                }
                Random random = new Random();
                int[][] matrix = new int[rows][columns];

                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        matrix[i][j] = random.nextInt(100) + 1; // [1, 100]
                    }
                }
                System.out.println("Generated matrix:");
                printMatrix(matrix);

                int finalColumn_sort_by = column_sort_by;
                Arrays.sort(matrix, Comparator.comparingInt(row -> row[finalColumn_sort_by]));

                System.out.println("-------------");
                printMatrix(matrix);
                writeMatrixToFile(outputNameFile, matrix);

            }

        }

    }