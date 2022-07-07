import java.util.Scanner;
// import java.lang.Math.*;
// import java.lang.Math.pow;

public class Program_3 {

	public static void main(String[] args) {
		
		System.out.println("НАЙДИТЕ ПЕРИМЕТР И ДИАГОНАЛЬ ПРЯМОУГОЛЬНИКА \n");
		Scanner num = new Scanner(System.in);
		int w, h, p; 
		double d;
		System.out.println("Ведите ширину прямоугольника");
		w = num.nextInt();
		System.out.println("Ведите высоту прямоугольника");
		h = num.nextInt();
		d = Math.sqrt(Math.pow(w,2)+Math.pow(h,2));
		p = h * 2 + w * 2;
		System.out.println("Периметр прямоугольника равен: " + p);
		System.out.println("Длина диагонали равен: " + d);
		num.close();
	}

}
}
