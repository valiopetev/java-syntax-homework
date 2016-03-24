import java.util.*;

public class RandomizeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        List<Integer> newNumbers = new ArrayList<>();
        if (firstNumber == secondNumber){
            System.out.println(firstNumber);
        }else if (firstNumber > secondNumber){
            for (int i = secondNumber; i <= firstNumber ; i++) {
                newNumbers.add(i);
                Collections.shuffle(newNumbers);
            }
        }else if (secondNumber > firstNumber){
            for (int i = firstNumber; i <= secondNumber ; i++) {
                newNumbers.add(i);
                Collections.shuffle(newNumbers);
            }
        }
        for (int number : newNumbers) {
            System.out.println(number);
        }
    }
}
