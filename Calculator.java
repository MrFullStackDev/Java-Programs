import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1, num2, sum, sub, div, mul;
        System.out.println("Enter First Number: ");
        num1 = sc.nextFloat();
        System.out.println("Enter Second Number: ");
        num2 = sc.nextFloat();
        sum = num1+num2;
        sub = num1-num2;
        mul = num1*num2;
        div = num1/num2;
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction :" + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);

    }
}
