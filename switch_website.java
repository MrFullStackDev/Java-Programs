import java.util.Scanner;

public class switch_website {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter website address: ");
        String domain = sc.nextLine();
        String dom = domain.substring(domain.lastIndexOf(".")+1);
        switch(dom)
        {
            case "com" -> System.out.println("Commercial");
            case "gov" -> System.out.println("Govt");
            case "net" -> System.out.println("Network");
            case "in" -> System.out.println("India");
            default -> System.out.println("Wrong Input");
        }
    }
}
