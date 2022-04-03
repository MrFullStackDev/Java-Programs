import java.sql.SQLOutput;
import java.util.Scanner;

public class stringmeth {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email id: ");
        String str = sc.nextLine();
        int i = str.indexOf("@");
        String username = str.substring(0,i);
        String domain = str.substring(i+1);
        System.out.println(username);
        System.out.println(domain);

        int j = domain.indexOf(".");
        String name = domain.substring(0,j);
        System.out.println(name.equals("gmail"));

    }
}
