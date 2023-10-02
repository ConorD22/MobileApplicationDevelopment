import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scan.nextInt();

        System.out.println("Sum: " + sum(num1, num2));
        System.out.println("Subtract: " + subtract(num1, num2));
        System.out.println("Product: " + product(num1, num2));
        System.out.println("Quotient: " + quotient(num1, num2));
    }

    static int sum(int a, int b){
        return a + b;
    }

    static int subtract(int a, int b){
        return a - b;
    }

    static int product(int a, int b){
        return a * b;
    }

    static double quotient(int a, int b){
        return a / b;
    }

}
