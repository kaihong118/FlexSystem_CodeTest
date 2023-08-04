package Q1;

import java.util.HashMap;
import java.util.Map;

public class ConvertNumberToWords {
    public static void main(String[] args) {
        System.out.println(Mapping(0));
        System.out.println(Mapping(100));
        System.out.println(Mapping(10));
        System.out.println(Mapping(59));
        System.out.println(Mapping(72));
        System.out.println(Mapping(13));
        System.out.println(Mapping(101));
    }

    public static String Mapping (int number) {
        Map<Integer, String> numberMapping = new HashMap<>();

        numberMapping.put(0, "Zero");
        numberMapping.put(1, "One");
        numberMapping.put(2, "Two");
        numberMapping.put(3, "Three");
        numberMapping.put(4, "Four");
        numberMapping.put(5, "Five");
        numberMapping.put(6, "Six");
        numberMapping.put(7, "Seven");
        numberMapping.put(8, "Eight");
        numberMapping.put(9, "Nine");
        numberMapping.put(10, "Ten");
        numberMapping.put(11, "Eleven");
        numberMapping.put(12, "Twelve");
        numberMapping.put(13, "Thirteen");
        numberMapping.put(14, "Fourteen");
        numberMapping.put(15, "Fifteen");
        numberMapping.put(16, "Sixteen");
        numberMapping.put(17, "Seventeen");
        numberMapping.put(18, "Eighteen");
        numberMapping.put(19, "Nineteen");
        numberMapping.put(20, "Twenty");
        numberMapping.put(30, "Thirty");
        numberMapping.put(40, "Forty");
        numberMapping.put(50, "Fifty");
        numberMapping.put(60, "Sixty");
        numberMapping.put(70, "Seventy");
        numberMapping.put(80, "Eighty");
        numberMapping.put(90, "Ninety");
        numberMapping.put(100, "One Hundred");

        if(number >= 0 && number <= 100) {
            if(numberMapping.containsKey(number)) {
                return numberMapping.get(number);
            }
            else {
                int secondNumber = number % 10;
                int firstNumber = number - secondNumber;

                return numberMapping.get(firstNumber) + "-" + numberMapping.get(secondNumber);
            }
        }
        return "The number is out of range";
    }
}
