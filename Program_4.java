package cycles;
import java.util.Scanner;

public class Program_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int i, j = 0, x;
        x = sc.nextInt();
        for(i=2; i<x; i++){
            
            // j++;
            // System.out.print((x / i) + " ");

            if(x % i == 0){
                j++;
                System.out.print((x / i) + " ");
            }
            sc.close();
        }
        System.out.print("\nКоличество делителей числа "+ x + " равно " + j);

    }
    
}
