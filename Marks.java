import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        int s1, s2, s3, avrg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 3 subjects below");
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();
        avrg = (s1+s2+s3) /3;
        if(avrg >= 70){
            System.out.println("The grade is A");
        }
        else if(avrg >= 60 && avrg <=70){
            System.out.println("The grade is B");
        }
        else if(avrg >= 50 && avrg <=60){
            System.out.println("The grade is C");
        }
        else if(avrg >= 40 && avrg <=50){
            System.out.println("The grade is D");
        }
        else{
            System.out.println("The grade is E");
        }
    }
}
