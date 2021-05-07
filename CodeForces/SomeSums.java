import java.util.Scanner;

public class SomeSums {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        String[] s = string.split(" ");

        int number = Integer.parseInt(s[0]);
        int min = Integer.parseInt(s[1]);
        int max = Integer.parseInt(s[2]);

        int result = 0;

        for (int i = 1; i <= number; i++) {
            if (i < 10 && i >= min && i <= max) {
                result += i;
            } else {
                int sum = 0;
                int temp = i;

                while (temp != 0) {
                    int digit = temp % 10;

                    sum += digit;

                    temp /= 10;
                }

                if (sum <= max && sum >= min) {
                    result += i;
                }
            }
        }

        System.out.println(result);
    }
}