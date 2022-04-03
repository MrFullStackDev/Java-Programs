import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = in.nextInt();
        if(num%2==0){
            System.out.println("The number entered is a even number.");
       }
        else{
            System.out.println("The number entered is a odd number.");
        }

    }
}
