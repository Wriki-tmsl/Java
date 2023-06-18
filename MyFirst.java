import java.util.Scanner;

class MyFirst
{ 
    public static void main(String arg[])
    {   Scanner sc = new Scanner(System.in);
        String str ="";
        System.out.println("Hello! Enter Your Name : ");
        str=sc.nextLine();       
        System.out.println("Welcome " + str);
    }
}
//