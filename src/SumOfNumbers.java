import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("input some digit: ");
        String number = in.nextLine();
        int result = 0;
        for (int i = 0; i < number.length(); i++) {
            result = result + Integer.parseInt(String.valueOf(number.charAt(i)));
            System.out.printf("Sum of digit: %s  \n", result);
            in.close();
        }
    }
}
