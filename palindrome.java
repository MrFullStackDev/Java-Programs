import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int rev=0, rem =0;
        while(n>0){
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n/10;
        }
        if(m == rev){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a Palindrome Number");
        }
    }
}
