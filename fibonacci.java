import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,a=0,b=1,c=0;
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        System.out.print(a+","+b+",");
        for(int i = 0; i < num - 2; i++){
            c = a + b;
            System.out.print(c+",");
            a = b;
            b = c;
        }
    }
}
