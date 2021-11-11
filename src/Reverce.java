import java.util.Scanner;

public class Reverce {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("input some word: ");
        String words = in.nextLine();
        String reverse = new StringBuffer(words).reverse().toString();
        System.out.printf("Reverce word: %s  \n", reverse);
        in.close();
    }
}
