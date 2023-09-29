import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.println("Hello, " + name);
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());

        String reverse = "";
        char ch;

        for(int i = 0; i <name.length(); i++){
            ch = name.charAt(i);
            reverse = ch + reverse;
        }

        System.out.println("Reverse: " + reverse);
        System.out.println("Contains '@': " + name.contains("@"));
    }
}
