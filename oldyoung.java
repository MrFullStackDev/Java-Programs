import java.util.Scanner;

public class oldyoung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        if(age < 14){
            System.out.println("You are a child");
        }
        else if(age >= 14 && age<= 55){
            System.out.println("You are young. Enjoy!");
        }
        else{
            System.out.println("You are old , please take rest!");
        }
    }
}
