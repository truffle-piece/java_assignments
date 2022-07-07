package If_else;
import java.util.Scanner;

public class Program_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Введите первое число: ");
        a = sc.nextInt();
        System.out.print("Введите второе число: ");
        b = sc.nextInt();
        if (a<b){
            c = b;
            b = a;
            a = c;
        }
        System.out.println(a + ", " + b);
        System.out.println(b + ", " + a);
    }
}
