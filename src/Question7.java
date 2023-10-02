import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        person1.age = 30;
        person1.name = "Alice";
        person2.age = 25;
        person2.name = "Bob";
        person1.introduce();
        person2.introduce();

        System.out.println("Please enter your name: ");
        person3.name = scan.nextLine();
        System.out.println("Please enter your age: ");
        person3.age = scan.nextInt();
        person3.introduce();
    }
}
class Person {
    String name;
    int age;

    void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}


