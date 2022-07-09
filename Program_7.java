package cycles;
import java.util.Random;

public class Program_7 {
    public static void main(String[] args) {
        Random rd = new Random();
        int i, j, a, b, c, sum, maxsum = 0, num = 0; 

        for(i=0; i<25; i++){
            j = rd.nextInt(889)+100;
            // System.out.print(j+" ");
            a = j/100;
            b = j%100/10;
            c = j%10;
            sum = a + b + c;
            if (sum>maxsum){
                maxsum=sum;
                num = i;
            }
            
        }
        System.out.print("\nПорядковый номер числа, сумма цифр которого была максимальной: " + num );
        System.out.print("\nСумма цифр: " + maxsum );

    }
    
}
