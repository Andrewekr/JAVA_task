import java.util.Scanner;

public class RandomNum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("range from: ");
        int a = in.nextInt();
        System.out.print("range to: ");
        int b = in.nextInt();
        for (int i = 0; i < 10; i++) {
            int random_number1 = a + (int) (Math.random() * b);
            System.out.print(" " + random_number1);
        }
    }

}