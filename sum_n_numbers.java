import java.util.Scanner;

public class sum_n_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = sc.nextInt();
        for(int i = 0; i<=num; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
