import java.util.Locale;
import java.util.Scanner;

public class switch_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("---Basic Calulator---");
        System.out.println("Enter your choice :");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        System.out.println("Enter first number");
        num1 = sc.nextInt();
        System.out.println("Enter second number");
        num2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Choice: ");
        String choice = sc.nextLine();
        choice = choice.toUpperCase();

        switch (choice) {
            case "ADD":
                System.out.println("The addition is: " + (num1+num2));
                break;
            case "SUB":
                System.out.println("The subtraction is: " + (num1-num2));
                break;
            case "MUL":
                System.out.println("The multiplication is: " + (num1*num2));
                break;
            case "DIV":
                System.out.println("The division is: " + (num1/num2));
                break;
            default:
                System.out.println("Never act smart");
                break;
        }
    }
}
