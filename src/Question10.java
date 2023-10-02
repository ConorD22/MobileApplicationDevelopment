import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        int converted = 0;
        Scanner scan = new Scanner(System.in);
        int[] decimal = new int[]{128, 64, 32, 16, 8, 4, 2, 1};
        int[] binaryConversion = new int[decimal.length];

        int j;
        for(j = 0; j < decimal.length; ++j) {
            System.out.println("Enter the binary digit in position " + j);
            int num = scan.nextInt();
            binaryConversion[j] = num;
        }

        for(j = 0; j < binaryConversion.length; ++j) {
            if (binaryConversion[j] != 0 && binaryConversion[j] == 1) {
                converted += decimal[j];
            }
        }

        System.out.println(converted);
    }
}
