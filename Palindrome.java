import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int num,rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        int n=num;
        while(n>0){
            int dig=n%10;
            rev=rev*10+dig;
            n=n/10;
        }
        if(num==rev){
                    System.out.println("It is a palindrome");
                }
        else{
                System.out.println("It is not a palindrome");
        }
    }
}
