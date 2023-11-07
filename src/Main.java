import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name;
        int age;
        double salary;

        System.out.println("Please Enter Your Name:");
        name = input.nextLine();
        System.out.println("Please Enter Your Age:");
        age = input.nextInt();
        System.out.println("Please Enter Your Salary:");
        salary = input.nextDouble();

        if (age < 0 || salary < 0) {
            System.out.println("Error: Negative values are not allowed.");

        }
        else {
            System.out.println("--------Survey Information--------");
            System.out.println("Name : "+name);
            System.out.println("Age : "+age);
            System.out.println("Salary : "+salary);
        }

    }
}
