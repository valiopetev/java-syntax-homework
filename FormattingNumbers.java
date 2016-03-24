import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        double secondNumber = input.nextDouble();
        double thirdNumber = input.nextDouble();

        String toHex = Integer.toHexString(firstNumber).toUpperCase();
        String toBinary = Integer.toBinaryString(firstNumber);
        int binaryResult = Integer.parseInt(toBinary);

        System.out.printf("|%1$-10s|%2$010d|%3$10.2f|%4$-10.3f| ", toHex, binaryResult, secondNumber, thirdNumber);
    }
}