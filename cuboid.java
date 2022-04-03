import java.util.Scanner;

public class cuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length, breadth, height;
        System.out.println("Enter the Length , Breadth and Height below ");
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();

        int total_area = 2 * ((length * height) + (length * breadth) + (breadth * height));
        int volume = (length * breadth * height);

        System.out.println("Total area of cuboid is : "+total_area);
        System.out.println("The volume of cuboid is : "+volume);

    }
}
