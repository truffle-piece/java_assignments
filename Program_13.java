package cycles;
import java.math.BigInteger;
import java.util.Scanner;

public class Program_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, x;
        System.out.print("Введите положительное число: ");
        x = sc.nextInt();
        sc.close();
        System.out.println("Делители числа " + x + ", которые являются простыми числами: ");
        for(i=1; i<x; i++){
            BigInteger bigInteger = BigInteger.valueOf(i);
            if (bigInteger.isProbablePrime((int) Math.log(i))){
                System.out.print(i + " ");
            }
        }
    }
}
