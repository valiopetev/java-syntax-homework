import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] firstLine = input.nextLine().split(" ");
        String[] secondLine = input.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <firstLine.length ; i++) {
            numbers.add(Integer.parseInt(firstLine[i]));
        }
        int getNumber = Integer.parseInt(secondLine[1]);
        String oddEven = secondLine[2];
        getOddEven(numbers,getNumber,oddEven);

    }
    static int getOddEven (List<Integer> numbers, int getNumber, String oddEven){
        if (oddEven.equals("odd")){
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) % 2 != 0){
                    System.out.print(numbers.get(i) + " ");
                    getNumber--;
                }
                if (getNumber == 0){
                    return 1;
                }
            }
        }else {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) % 2 == 0){
                    System.out.print(numbers.get(i) + " ");
                    getNumber--;
                }
                if (getNumber == 0){
                    return 1;
                }
            }
        }
        return 1;
    }
}
