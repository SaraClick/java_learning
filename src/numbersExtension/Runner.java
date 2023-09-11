package numbersExtension;

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

    public static void main(String[] args) {

        System.out.println(addNumbers(23));
        System.out.println(addNumbers(76));
        System.out.println(addNumbers(81));

        System.out.println(addNumbers2(23));
        System.out.println(addNumbers2(76));
        System.out.println(addNumbers2(81));

    }
}
