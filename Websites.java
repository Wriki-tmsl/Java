import java.util.Scanner;
public class Websites {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str;
        System.out.println("Enter the URL");
        str=sc.nextLine();
        int i = str.indexOf(":");
        int j = str.lastIndexOf(".")+1;
        String protocol=str.substring(0,i);
        if(protocol.equals("https")){
            System.out.println(protocol+" is Hypertext Transfer Protocol Secured");
        }
        else if (protocol.equals("http")){
            System.out.println(protocol+" is Hypertext Transfer Protocol");
        }
        else{
            System.out.println(protocol+" is not Hypertext Transfer Protocol");
        }
        String domain=str.substring(j);
        if(domain.equals("com")){
            System.out.println(domain+" is commertial");
        }
        else if(domain.equals("gov")){
            System.out.println(domain+" is government");
        }  
        else if(domain.equals("in")){
            System.out.println(domain+" is Indian");
        } 
        else if(domain.equals("net")){
            System.out.println(domain+" is Network");
        }
        else if(domain.equals("org")){
                    System.out.println(domain+" is Organization");
        }
        else if(domain.equals("edu")){
            System.out.println(domain+" is Educational");
        }
        else{
            System.out.println(domain);
        }
    }
}
