package cycles;

public class Program_12 {
    public static void main(String[] args) {
        int i, j, sum = 0;
        for(i=100; i<=999; i++){
            
            for(j=1; j<=i; j++){
                if(j%2!= 0){
                    sum +=j; 
                }
            }

            if(i % 100==0 && sum % 100 == 0){
                System.out.print(i + " ");
            }

        }
    }
}
