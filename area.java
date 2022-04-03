import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float base = 0, height = 0;
        System.out.println("Enter the base of a triangle");
        base = sc.nextFloat();
        System.out.println("Enter the height of a triangle");
        height = sc.nextFloat();
        float area = (base * height)  / 2;
        System.out.println("The area of the triangle is "+area);
    }
}
