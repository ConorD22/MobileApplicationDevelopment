import java.text.DecimalFormat;

public class Question1 {
    public static void main(String[] args) {
        char initial = 'J';
        String surname = "Smith";
        int age = 25;
        double salary = 21000.00;
        boolean isEmployed = true;

        DecimalFormat df = new DecimalFormat();

        System.out.print(initial + " " + surname + " is " + age + " years old, ");

        if(isEmployed){
            System.out.print("is currently employed and has a salary of £" + df.format(salary) + " per year.");
        }else{
            System.out.print("is currently not employed and has a salary of £" + df.format(salary) + " per year.");
        }
    }
}
