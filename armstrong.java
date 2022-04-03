import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int rem = 0, sum=0;
        while(n>0){
            rem = n % 10;
            n = n / 10;
            sum = sum + (rem * rem * rem);
        }
        if(num == sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}
