package If_else;
import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Введите первое число: ");
        a = sc.nextInt();
        System.out.print("Введите второе число: ");
        b = sc.nextInt();
        System.out.println(a==b?"Числа равны":"Числа не равны");
    }
}
