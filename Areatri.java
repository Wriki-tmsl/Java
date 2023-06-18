import java.util.Scanner;
class Areatri
{ 
    
    public static void main(String arg[])

    {
        Scanner sc = new Scanner(System.in);
            int a,b,c;
            float s ,ar;
            System.out.println("Enter 3 sides of a triangle :");
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            s=(float)(a+b+c)/2;
            ar = (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area is "+ar);
    }
    
}
/*public static void main(String arg[])

    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base of triangle");
        int b= sc.nextInt();
        System.out.println("Enter height of triangle");
        int h= sc.nextInt();
        float c = (1/2)*b*h;

        System.out.println("Area of Triangle is " +c);
    }*/