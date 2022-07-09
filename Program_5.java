package cycles;

public class Program_5 {
    public static void main(String[] args) {
        System.out.println("Последовательность Фибоначчи");
        int a, b, c;
        a = 0;
        b = 1;
        for (int i = 3; i <= 10; ++i) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(b+" ");
        }
    }
}
