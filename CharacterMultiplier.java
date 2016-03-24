import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstStr = input.next();
        String secondStr = input.next();

        System.out.println(charSum(firstStr, secondStr));
    }
    static int charSum (String firstStr, String secondStr){
        int product = 0;
        String biggestString = new String("");
        String smallestString = new String("");
        if (firstStr.length() <= secondStr.length()) {
            biggestString += secondStr;
            smallestString += firstStr;
        }else {
            biggestString += firstStr;
            smallestString += secondStr;
        }
        for (int i = 0; i < smallestString.length(); i++) {
            product += firstStr.charAt(i) * secondStr.charAt(i);
        }
        for (int i = smallestString.length(); i < biggestString.length(); i++) {
            product += biggestString.charAt(i);
        }
        return product;
    }
}
