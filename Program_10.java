package cycles;

public class Program_10 {
    public static void main(String[] args) {
        int i, j = 0, a, b, c, sum=0;
        for(i = 10; i<100; i++){
            a=i/10;
            b=i%10;
            c=a+b;
            if(i%c==0 && i>j){
                sum = i/c;
                j = i;
            }
        }
        
        System.out.println("Сумма: " + sum+"\nЧисло: " + j);
    }
    
}
