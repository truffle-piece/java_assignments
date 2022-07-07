package If_else;
import java.util.Scanner;

public class Program_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int avg, one, two, num, ugol1, ugol2, ugol3;
		double mark;

		// Если значение переменной avg равно 100,то выведи на экран сообщение “Молодец” 
		System.out.print("Введите число: ");
		avg = sc.nextInt();
		System.out.println(avg==100?"Молодец \n":null);

		// Если значение переменной mark меньше 60, то увеличить это значение на 10%
		System.out.print("Введите число: ");
		mark = sc.nextInt();
		System.out.println(mark<60?mark+(mark*0.1):null);

		// Если значение переменной one больше значения переменной two,
		// то вывести на экран значение one; в противном случае - вывести на экран значение переменной two 
		System.out.print("Введите первое число: ");
		one = sc.nextInt();
		System.out.print("Введите второе число: ");
		two = sc.nextInt();
		System.out.println(one>two?one:two);

		// Если значение переменной num больше нуля, то вывести на экран сообщение положительное. 
		System.out.print("Введите число: ");
		num = sc.nextInt();
		System.out.println(num>0?"Положительное \n":"Отрицательное \n");

		// Если сумма переменных ugoll, ugol2 и ugol3 составляет 180,
		// то вывести на экран сообщение “Это углы одного треугольника”;
		// в противном случае вывести на экран сообщение “Это не углы одного треугольника”
		System.out.print("Введите первое число: ");
		ugol1 = sc.nextInt();
		System.out.print("Введите второе число: ");
		ugol2 = sc.nextInt();
		System.out.print("Введите третье число: ");
		ugol3 = sc.nextInt();
		System.out.println(ugol1+ugol2+ugol3==180?"Это углы одного треугольника \n":"Это не углы одного треугольника \n");



	}

}