package cycles;
import java.util.Scanner;


public class Program_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, w, i;
        for(i=1; i<=7; i++){
                System.out.print("Введите вес " + i +"-го человека: ");
                w = sc.nextInt();
                sum +=w;
            if(sum<450 && i<7){
                System.out.println("Общий вес" + sum);
            }else if(i==7){
                System.out.print("Превышение количество людей, вошедших в лифт! \nПользование лифтом невозможно!");
                sc.close();
                break;            
            }else{
                System.out.print("Превышение допустимого веса! \nПользование лифтом невозможно!");
                sc.close();
                break;
            }

        }
        

        
    }
    
}
