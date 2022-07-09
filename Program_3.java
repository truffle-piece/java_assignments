package cycles;

public class Program_3 {
    public static void main(String[] args) {
        int i, a, b;
        for(i = 10; i<100; i++){
            a = i/10;
            b = i%10;
            System.out.print(10<=a+b && a+b<=100? i+" ":"");
        }
    }
    
}
