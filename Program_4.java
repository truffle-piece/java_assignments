import java.util.Scanner;

public class Program_4 {

	public static void main(String[] args) {
		
		System.out.println("СРАВНИТЕ ЧИСЛА \n");
		Scanner num = new Scanner(System.in);
		int a, b;
		System.out.println("Введите первое число");
		a = num.nextInt();
		System.out.println("Введите второе число");
		b = num.nextInt();
		if (a == b) {
			System.out.println("Числа ровны");
		} else if (a < b) {
			System.out.println("Первое число меньше второго");
		}else {
			System.out.println("Первое число больше второго");
		}
		num.close();

	}

}
