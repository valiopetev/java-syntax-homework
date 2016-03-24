import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sideA = input.nextInt();
        int sideB = input.nextInt();
        int sum = sideA * sideB;
        System.out.println(sum);
    }
}
