import java.util.Scanner;

public class Digits{

     public static void main(String []args){
        
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        
        for(int i = 0 ; i < count ; i++) {
            int number = scanner.nextInt();
            
            if(number == 0) {
                System.out.println(0);
                continue;
            }
            
            while(number != 0) {
                int result = number % 10;
                
                System.out.print(result + " ");
                
                number /= 10;
            }
            
            System.out.println();
        }
    }
}