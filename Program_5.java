import java.util.Scanner;

public class Program_5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Введите первое число");
		int a = scan.nextInt();
		
		System.out.print("Введите символ используя +, -, *, /: ");
		char sim = scan.next().charAt(0);
		System.out.print("Введите второе число");
		int b = scan.nextInt();
		int result;

		if (sim == '/' || sim == '+' || sim == '-' || sim == '*') {
			if (sim == '+') {
				result = a + b;
				System.out.println(a + "+" + b + "=" + result);
			} else if (sim == '-') {
				result = a - b;
				System.out.println(a + "-" + b + "=" + result);
			} else if (sim == '*') {
				result = a * b;
				System.out.println(a + "*" + b + "=" + result);
		
			} else if (sim == '/' && b == 0) {
				System.out.println("Ошибка: делить на ноль нельзя");
			} else if (sim == '/') {
				result = a / b;
				System.out.println(a + "/" + b + "=" + result);
			}
		}else {
			System.out.println("Неверный символ!");
		}
		scan.close();

	}

}
