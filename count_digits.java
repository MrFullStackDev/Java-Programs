import java.util.Scanner;

public class count_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rem=0, count =0;
        int n = sc.nextInt();
        while(n>0){
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }
}
