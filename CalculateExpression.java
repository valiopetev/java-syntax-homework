import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();
        double thirdNumber = input.nextDouble();

        double firstFormula = Math.pow(((firstNumber * firstNumber + secondNumber * secondNumber) /
                (firstNumber * firstNumber - secondNumber * secondNumber)), (firstNumber + secondNumber + thirdNumber)
        / (Math.sqrt(thirdNumber)));
        double secondFormula = Math.pow((firstNumber * firstNumber + secondNumber * secondNumber -
                thirdNumber * thirdNumber * thirdNumber), firstNumber - secondNumber);
        double firstAverage = (firstNumber + secondNumber + thirdNumber) / 3;
        double secondAverage = (firstFormula + secondFormula) / 2;
        double diff = Math.abs(firstAverage - secondAverage);

        System.out.printf("F1 result: %1$.2f; F2 result: %2$.2f; Diff: %3$.2f", firstFormula, secondFormula, diff);
    }
}
