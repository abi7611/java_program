import java.util.Scanner;

public class BitwiseOperators {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        
        System.out.println("Bitwise AND (&): " + (num1 & num2));
        System.out.println("Bitwise OR (|): " + (num1 | num2));
        System.out.println("Bitwise XOR (^): " + (num1 ^ num2));
        System.out.println("Bitwise NOT (~) of num1: " + (~num1));
        System.out.println("Bitwise NOT (~) of num2: " + (~num2));
        System.out.println("Left Shift (<<) of num1 by 2: " + (num1 << 2));
        System.out.println("Right Shift (>>) of num1 by 2: " + (num1 >> 2));
        System.out.println("Unsigned Right Shift (>>>) of num1 by 2: " + (num1 >>> 2));
        
        
        scanner.close();
    }
}