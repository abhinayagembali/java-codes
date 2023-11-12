import java.util.Scanner;

public class Person {
    String name;
    int age;
    String gender;

    public Person() {
    
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter gender: ");
        String gender = sc.nextLine();

        Person person = new Person(name, age, gender);
        person.displayDetails();
    }
}