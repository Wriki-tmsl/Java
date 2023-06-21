import java.util.Scanner;
public class Marksgrade {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 3 Subjects : ");
        int a,b,c;float avg;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        avg=(float)(a+b+c)/3;
        if(avg<40){
            System.out.println("Grade : F");}
        else if(avg>40 && avg<=50){
            System.out.println("Grade : D");}
        else if(avg>50 && avg<=60){
            System.out.println("Grade : C");}
        else if(avg>60 && avg<=70){
            System.out.println("Grade : B");}
        else if(avg>70){
            System.out.println("Grade : A");}
        }
}
