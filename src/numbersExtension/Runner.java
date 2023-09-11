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

    public static String numToString(int num) {
        // System.out.println("num: " + num);
        
        // We accept zero in the if statement so we can assess numbers ending in a round dec (20/30/40...)
        if (num >= 0 && num <= 9999) {
            String result = "";

            String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
            String[] teens = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "nineteen"};
            String[] tens = {"", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

            if (num >= 1000) {
                result += units[(num / 1000)] + " thousand " + numToString(num % 1000);
            } else if (num >= 100){
                result += units[(num / 100)] + " hundred " + numToString(num % 100);
            } else if (num >= 20) {
                result += tens[(num / 10) - 1] + " " + numToString((num % 10));
            } else if (num >= 11) {
                result += teens[(num / 10) -1];
            } else {
                result += units[num];
            }

            return result;
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
        System.out.println(numToString(111));
        System.out.println(numToString(6));
        System.out.println(numToString(200));
        System.out.println(numToString(30));
        System.out.println(numToString(3076));
        System.out.println(numToString(9999));

    }
}
