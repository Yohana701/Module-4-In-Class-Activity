import java.util.Scanner;
import java.util.Arrays;
public class AscendingAndDescending {
    public static void main(String[] args) {
        //Creating a scanner object to collect user data
        Scanner scanner = new Scanner(System.in);
        //Prompt the user to enter three integers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        //Create an array to hold the three integers
        int[] numbers = {num1, num2, num3};
        //Sort in ascending order
        Arrays.sort(numbers);
        //Display the numbers in ascending order
        System.out.println("Number in ascending order: " + numbers[0] + " " + numbers[1] + " " + numbers[2] + ".");
        //Display the numbers in descending order
        System.out.println("Number in descending order: " + numbers[2] + " " + numbers[1] + " " + numbers[0] + ".");

        scanner.close();
    }
}
