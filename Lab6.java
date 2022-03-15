import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        //Get two numbers
        System.out.println("Enter first number");
        int x = userInput.nextInt();
        System.out.println("Enter second number");
        int y = userInput.nextInt();
        //Add numbers and return value
        System.out.print("Here is the result: ");
        int z = x + y;
        System.out.println(z);
    }
}
