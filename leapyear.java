import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        int year;
        Scanner in = new Scanner(System.in);
        year = in.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0) {
                    System.out.println("This is a leap year.");
                }
                else {
                    System.out.println("This is not a leap year");
                }
            }
            else{
                System.out.println("This is a leap year");
            }
        }
        else
        {
            System.out.println("This is not a leap year.");
        }
    }
}
