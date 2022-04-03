import java.util.Scanner;

public class switch_day {
    public static void main(String[] args) {
        int day;
        Scanner sc = new Scanner(System.in);
        day = sc.nextInt();
        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a number between 1 - 7");
                break;
        }
    }
}
