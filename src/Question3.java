import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       System.out.print("Enter a number to check if it is even or odd: ");
       int num = scan.nextInt();

       if(num % 2 == 0){
           System.out.print(num + " is even");
       }else{
           System.out.print(num + " is odd");
       }
    }
}
