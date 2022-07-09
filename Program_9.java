package cycles;
import java.util.Scanner;

public class Program_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, x , k=0;
        boolean isBol = true;
        while(isBol){
            System.out.print("Введите число: ");
            x = sc.nextInt();
            a += 1;
            if(a%2!=0 && x%2==0){
                k += 1;
                if(k >= 5){
                    isBol = false;
                    System.out.print("Четных чисел на нечетных местах в серии остаелось меньше 5");
                    sc.close();
                }
            }
        }

        
    }
    
}
