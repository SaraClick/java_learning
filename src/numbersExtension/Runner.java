package numbersExtension;

import java.lang.reflect.Array;

public class Runner {

    // OPTION 1
    public static int addNumbers(int number) {
        if (number < 10 || number > 99) {
            return -1;
        } else {
            int num1 = number / 10; // returns las decenas
            int num2 = number % 10;  // returns las unidades

            return num1 + num2;
        }
    }

    // OPTION 2 (based on Stephanie's solution
    public static int addNumbers2(int number) {
        int result = 0;
        if (number >= 10 && number <= 99) {
            String numString = Integer.toString(number);
            char[] numStringArray = numString.toCharArray();
            for (char c : numStringArray) {
                result += Character.getNumericValue(c);
            }
            return result;
        }
        return -1;
    }

    public static String numToString(int num) {
        if (num >= 1 && num <= 99) {
            String result = "";
            int dec = num / 10;
            int unit = num % 10;

            String[] units = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            String[] decens = {"teen", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

            if (num == 10) {
                return "ten";
            } else if (num == 11) {
                return "eleven";
            } else if (num == 12) {
                return "twelve";
            } else {
                if (num <= 9) {
                    return units[unit - 1];
                } else {
                    if (unit == 0) {
                        return decens[dec - 1];
                    } else {
                        return decens[dec - 1] + "-" + units[unit - 1];
                    }
                }
            }
        }
        return "Invalid input";
    }

    public static void main(String[] args) {

//        System.out.println(addNumbers(23));
//        System.out.println(addNumbers(76));
//        System.out.println(addNumbers(81));
//
//        System.out.println(addNumbers2(23));
//        System.out.println(addNumbers2(76));
//        System.out.println(addNumbers2(81));

        System.out.println(numToString(25));
        System.out.println(numToString(11));
        System.out.println(numToString(6));
        System.out.println(numToString(200));
        System.out.println(numToString(30));

    }
}
