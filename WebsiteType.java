import java.util.Scanner;
public class WebsiteType {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str;
        System.out.println("Enter the URL");
        str=sc.nextLine();
        int j = str.lastIndexOf(".")+1;
        String domain=str.substring(j);
        System.out.println(domain + "\n");
        switch(domain){
            case "com":
            System.out.println("Commertial Domain");
            break;
            case"org":
            System.out.println("Organizational Domain");
            break;
            case"net":
            System.out.println("Network Domain");
            break;
            case"edu":
            System.out.println("Educational Domain");
            break;
            default:
            System.out.println("Other Domain");

        }

    }
    
}