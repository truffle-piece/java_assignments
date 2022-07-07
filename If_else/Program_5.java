package If_else;
import java.util.Scanner;;

public class Program_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите отрицательное число: ");
        int a = sc.nextInt();
        System.out.println(a<0?a*a:"Ошибка");
    }
}
