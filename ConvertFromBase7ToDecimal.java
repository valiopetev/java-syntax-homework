import java.util.Scanner;

public class ConvertFromBase7ToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String base7 = input.nextLine();
        int decimal = Integer.valueOf(base7, 7);
        System.out.println(decimal);
    }
}