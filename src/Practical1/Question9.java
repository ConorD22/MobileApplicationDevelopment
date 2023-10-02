import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Please select an option");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("4. Circle");
            System.out.println("5. Exit");
            int userInput = scan.nextInt();

            switch (userInput){
                case 1:
                   square();
                   break;
                case 2:
                   rectangle();
                   break;
                case 3:
                    triangle();
                    break;
                case 4:
                    circle();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    scan.close();
                    return;
                default:
                    System.out.println("Invalid Option, Please try again!\n");
            }
        }
    }


    static void square(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the square: ");
        double length = scan.nextDouble();
        double area = length * length;
        System.out.println("Area = " + area);
    }

    static void rectangle(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = scan.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scan.nextDouble();

        double area = length * width;
        System.out.println("Area = " + area);
    }

    static void triangle(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        double height = scan.nextDouble();
        System.out.print("Enter the base of the rectangle: ");
        double base = scan.nextDouble();

        double area = height * base / 2.0;
        System.out.println("Area = " + area);
    }

    static void circle(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scan.nextDouble();
        double area = Math.PI * Math.pow(radius, 2.0);

        System.out.println("Area = " + area);
    }
}
