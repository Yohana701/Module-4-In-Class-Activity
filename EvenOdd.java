import java.util.Scanner;
public class EvenOdd {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in); //Create a Scanner object for user input
        //Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt(); //Read the integer from the user
        //Determine whether the number is even odd
        boolean isEven = isEven(number);
        //Display the result
        if(isEven){
            System.out.println("The number " + number + " is even!");
        } else{
            System.out.println("The number " + number + " is odd!");
        }
        scanner.close();
    }
    //Method to determine whether the number is even
    public static boolean isEven(int num){
        return num % 2 == 0; //return true if even
    }
}
