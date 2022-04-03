import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, rem = 0;
        num = sc.nextInt();
        while(num>0){
            rem = num % 10;
            num = num / 10;
            System.out.println(rem);
        }
    }
}
