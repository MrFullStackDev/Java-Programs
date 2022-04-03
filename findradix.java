import java.sql.SQLOutput;
import java.util.Scanner;

public class findradix {
    public static void main(String[] args) {
        String val;
        Scanner in = new Scanner(System.in);
        val = in.nextLine();
        if(val.matches("[01]+"))
        {
            System.out.println("Radix is Binary");
        }
        else if(val.matches("[0-7]+"))
        {
            System.out.println("Radix is Octal");
        }
        else if(val.matches("[0-9]+"))
        {
            System.out.println("Radix is Decimal");
        }
        else if(val.matches("[0-9A-F]+"))
        {
            System.out.println("Radix is Hexadecimal");
        }
    }
}
