public class regularExp {
    public static void main(String[] args){
        int b=10101010;
        String str=String.valueOf(b);
        System.out.println(str.matches("[01]+"));
        String str1="12ac4fe";
        System.out.println(str1.matches("[0-9,a-f]+"));
        String str2="09/12/1993";
        System.out.println(str2.matches("[0-3][0-9]/[01][0-9]/[0-9]{}"));

    }
}
