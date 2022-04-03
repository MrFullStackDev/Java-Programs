import java.util.Scanner;

public class websearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url;
        url = sc.nextLine();
        String protocol = url.substring(0,url.indexOf(":"));
        if(protocol.equals("https"))
        {
            System.out.println("It is hyper text transfer protocol.");
        }
        else if(protocol.equals("ftp"))
        {
            System.out.println("It is file transfer protocol.");
        }
        else
            System.out.println("Use HTTP or FTP protocol");
        String domain = url.substring(url.lastIndexOf(".")+1);
        if(domain.equals("com"))
        {
            System.out.println("It is commercial domain name.");
        }
        else if(protocol.equals("gov"))
        {
            System.out.println("It is government domain name.");
        }
        else
            System.out.println("Use com or gov domain name.");
    }
}
