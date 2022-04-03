import java.util.Scanner;

public class WelcomeUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name: ");
        String name = sc.nextLine();
        System.out.println("Welcome to the Team, " + name+"!");
    }
}
