import java.util.*;

public class num_to_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem;
        String str = "";
        char c;
        while(num>0){
            rem = num % 10;
            num = num / 10;
            str = str + rem;
        }
        System.out.println(str);
        for(int i = str.length()-1; i >= 0; i--){
            c = str.charAt(i);
            switch(c){
                case '0' -> System.out.print("zero ");
                case '1' -> System.out.print("one ");
                case '2' -> System.out.print("two ");
                case '3' -> System.out.print("three ");
                case '4' -> System.out.print("four ");
                case '5' -> System.out.print("five ");
                case '6' -> System.out.print("six ");
                case '7' -> System.out.print("seven ");
                case '8' -> System.out.print("eight ");
                case '9' -> System.out.print("nine ");
            }
        }
    }
}
