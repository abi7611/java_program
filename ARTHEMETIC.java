import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        double remainder = num1 % num2;
        
        
        System.out.println("You entered " + num1 + " and " + num2 + ".");
        System.out.println("Here are the results of the arithmetic operations:");
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + sum);
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + difference);
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + product);
        System.out.println("Division: " + num1 + " / " + num2 + " = " + quotient);
        System.out.println("Remainder: " + num1 + " % " + num2 + " = " + remainder);
        
        
        scanner.close();
    }
}