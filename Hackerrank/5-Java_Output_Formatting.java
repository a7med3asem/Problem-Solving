import java.util.Scanner;

public class Java_Output_Formatting {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("================================");
            for(int i = 0 ; i < 3 ; i++)
            {
                String s1 = sc.next();
                int x = sc.nextInt();
                
                //Complete this line
                for(int j = 0 ; j < 15 ; j++) {
                    if(j < s1.length()){
                        System.out.printf("%c", s1.charAt(j));                 
                    } else {
                        System.out.printf(" ");
                    }
                }
                
                if(x < 10)
                    System.out.printf("%s", "00");
                else if(x < 100)
                    System.out.printf("%s", "0");
                
                System.out.printf("%d%n", x);
            }
            System.out.println("================================");

    }
}



