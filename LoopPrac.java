public class LoopPrac {
    public static void main(String[] args) {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
            int i = 40;
            while(i>30){
                System.out.println(i);
                                i--;
                        }
            do{
                System.out.println(i);
                i--;
            }while(i>10);
        
        for (int p= 0,j=1,k=20; k>0; p++,j*=3,k--) {
                System.out.println(p+ " "+j+ " "+k);
            }
        }
}
