import java.util.Scanner;

public class AssignmentOperators {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter an initial number: ");
        int num = scanner.nextInt();

        
        int result = num;
        System.out.println("Simple assignment (num = result): " + result);

        
        result += 5;  
        System.out.println("Addition assignment (result += 5): " + result);

       
        result -= 3;  
        System.out.println("Subtraction assignment (result -= 3): " + result);

       
        result *= 2; 
        System.out.println("Multiplication assignment (result *= 2): " + result);

        
        result /= 4;  
        System.out.println("Division assignment (result /= 4): " + result);

       
        result %= 3;  
        System.out.println("Modulus assignment (result %= 3): " + result);
        
        
        scanner.close();
    }
}