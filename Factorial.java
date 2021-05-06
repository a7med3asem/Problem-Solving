import java.util.Scanner;

public class Factorial{

     public static void main(String []args){
        
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        
        String result = number == 1 ? "NO" : "YES";
        
        System.out.println(result);
    }
    
    public static long getFactorial(long num) {
        long result = 1;
        
        for(int i = 2 ; i <= num ; i++) {
            result = result * num;
        }

        return result;
    }
}