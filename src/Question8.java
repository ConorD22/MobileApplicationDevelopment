import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Welcome the the calculator, please select an option");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            int userInput = scan.nextInt();

            switch(userInput){
                case 1:
                    System.out.print("Please enter your first number: ");
                    double add1 = scan.nextDouble();
                    System.out.print("Please enter your second number: ");
                    double add2 = scan.nextDouble();

                    double sum = add1 + add2;
                    System.out.println("Result: " + sum + "\n");
                    break;

                case 2:
                    System.out.print("Please enter your first number: ");
                    double sub1 = scan.nextDouble();
                    System.out.print("Please enter your second number: ");
                    double sub2 = scan.nextDouble();

                    double sub = sub1 - sub2;
                    System.out.println("Result: " + sub + "\n");
                    break;

                case 3:
                    System.out.print("Please enter your first number: ");
                    double mult1 = scan.nextDouble();
                    System.out.print("Please enter your second number: ");
                    double mult2 = scan.nextDouble();

                    double mult = mult1 * mult2;
                    System.out.println("Result: " + mult + "\n");
                    break;

                case 4:
                    System.out.print("Please enter your first number: ");
                    double div1 = scan.nextDouble();
                    System.out.print("Please enter your second number: ");
                    double div2 = scan.nextDouble();



                    while(div2 == 0.0 || div1 == 0) {
                        System.out.println("Cannot divide by zero try again");
                        System.out.println("Enter your first number");
                        div1 = scan.nextDouble();
                        System.out.println("Enter your second number");
                        div2 = scan.nextDouble();
                    }

                    double div = div1 / div2;
                    System.out.println("Result: " + div + "\n");
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    scan.close();
                    return;

                default:
                    System.out.println("Invalid option, Please try again\n");
            }
        }


    }
}
