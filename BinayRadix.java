import java.util.Scanner;

public class BinayRadix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary digit: ");
        sc.useRadix(2);
        int num = sc.nextInt();
        System.out.println("The converted number is: " + num);
    }
}
