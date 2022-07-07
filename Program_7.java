package If_else;
import java.util.Scanner;

public class Program_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
        System.out.print("Введите трехзначное число: ");
        a = sc.nextInt();
        if(a<100 || a>=1000){
            System.out.println("Неверное число");
        }else{
            b = a/100;
            c = a%100/10;
            d = a%10;

            //Переменная "a" без изменений
            System.out.println(a>500?d*100+c*10+b:b*100+d*10+c);
            
            //Для изменения переменной "а"
            // if(a>500){
            //     a=d*100+c*10+b;
            // }else{
            //     a=b*100+d*10+c;
            // }
            // System.out.println(a);
        }
    }
}
