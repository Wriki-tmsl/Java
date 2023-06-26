import java.util.Scanner;
public class SimpleCalc{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.print("Enter an operator: ");
        char op = input.next().charAt(0);
        System.out.print("Enter another number: ");
        int num2 = input.nextInt();
        switch (op) {
            case '+':
                System.out.println(num + num2);
                break;
            case '-':
                System.out.println(num - num2);
                break;
            case '*':
                System.out.println(num * num2);
                break;
            case '/':
                System.out.println(num / num2);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
