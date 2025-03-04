import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        
        boolean isEqual = (num1 == num2);
        boolean isNotEqual = (num1 != num2);
        boolean isGreaterThan = (num1 > num2);
        boolean isLessThan = (num1 < num2);
        boolean isGreaterThanOrEqual = (num1 >= num2);
        boolean isLessThanOrEqual = (num1 <= num2);
        
        
        System.out.println("\nComparing " + num1 + " and " + num2 + ":");
        System.out.println(num1 + " == " + num2 + " : " + isEqual);
        System.out.println(num1 + " != " + num2 + " : " + isNotEqual);
        System.out.println(num1 + " > " + num2 + " : " + isGreaterThan);
        System.out.println(num1 + " < " + num2 + " : " + isLessThan);
        System.out.println(num1 + " >= " + num2 + " : " + isGreaterThanOrEqual);
        System.out.println(num1 + " <= " + num2 + " : " + isLessThanOrEqual);
        
        
        scanner.close();
    }
}