package cycles;
import java.util.Random;

public class Program_8 {
    public static void main(String[] args) {
        Random rd = new Random();
        int i, j, a = 0; 

        for(i=0; i<24; i++){
            j = rd.nextInt(889)+100;
            // System.out.print(j+" ");
            if (a<j){
                a=i;
            }
        }
        System.out.print("\nПорядковый номер самого большого из сгенерированных чисел: " + a );
    }
}
