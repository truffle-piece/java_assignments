package If_else;
import java.util.Scanner;

public class Program_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Введите двухзначное число: ");
        a = sc.nextInt();
        if (a>=100 || a<10){
            System.out.println("Неверное число");
        }else{
            b = a/10;
            c = a%10;
            System.out.println(c==b? "":b<c?b+" < "+c:b+" > "+c);
        }
    }
}
