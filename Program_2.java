package cycles;
import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, i, j;
        System.out.print("Введите число: ");
        x = sc.nextInt();
        sc.close();
        System.out.println("\nНачало цикла");
        j = x + 1;
        for (i = 0; i<17; i++ ){
            System.out.print(j+" ");
            j+=3;

        }
        System.out.println("\nКонец цикла");

        sc.close();
    }
    
}
