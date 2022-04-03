import java.util.Scanner;

public class swapping {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter A");
        num1 = sc.nextInt();
        System.out.println("Enter B");
        num2 = sc.nextInt();
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;


        System.out.println("Value of A after swapping: "+num1);
        System.out.println("Value of B after swapping: "+num2);
    }
}
