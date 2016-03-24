import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstPoint = input.nextLine();
        String secondPoint = input.nextLine();
        String thirdPoint = input.nextLine();

        String[] firstCoord = firstPoint.split(" ");
        String[] secondCoord = secondPoint.split(" ");
        String[] thirdCoord = thirdPoint.split(" ");

        int firstX = Integer.parseInt(firstCoord[0]);
        int firstY = Integer.parseInt(firstCoord[1]);
        int secondX = Integer.parseInt(secondCoord[0]);
        int secondY = Integer.parseInt(secondCoord[1]);
        int thirdX = Integer.parseInt(thirdCoord[0]);
        int thirdY = Integer.parseInt(thirdCoord[1]);

        int area = (firstX * (secondY - thirdY) + secondX * (thirdY - firstY) + thirdX * (firstY - secondY)) / 2;
        if (area < 0) {
            System.out.println(-area);
        }else{
            System.out.println(area);
        }
    }
}
