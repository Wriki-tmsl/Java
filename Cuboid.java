import java.util.Scanner;
public class Cuboid {
    public static void main(String arg[])

    {
        Scanner sc = new Scanner(System.in);
            int l,b,h;
            float Vol,Area;
            System.out.println("Enter Length Breadth and Height :");
            l=sc.nextInt();
            b=sc.nextInt();
            h=sc.nextInt();
            Vol= (l*b*h);
            Area= 2*(l*b+b*h+l*h);
            
           
        System.out.println("Volume : "+Vol +"\nSurface Area :"+Area);
    }
    
}
