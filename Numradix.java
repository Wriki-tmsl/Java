import java.util.Scanner;
public class Numradix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String num;
        num=sc.nextLine();
        if(num.matches("[10]+")){
            System.out.println("Radix = 2");
        }
        else if(num.matches("[0-7]+")){
            System.out.println("Radix = 8");
        }
        else if(num.matches("[0-9]+")){
            System.out.println("Radix = 10");
        }
        else if(num.matches("[0-9A-F]+")){
            System.out.println("Radix = 16");
        }
        else{
           System.out.println("Not a Number"); 
        }
    }
}
