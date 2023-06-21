public class regExp {
    public static void main(String[] args){
        String str="wi@bgo%43*u752q";
        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));
        String str1="  abc     kn  leood    ";
        String str2=str1.replaceAll("\\s+"," ").trim();
        System.out.println(str2);
        String words[]=str2.split("\\s");
        System.out.println(words.length);

    }
}
