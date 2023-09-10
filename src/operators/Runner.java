package operators;

public class Runner {
    public static void main(String[] args) {

        /*OPERATORS
        = assignment, assigns a value to a variable
        == is a quality (to check if equal to another thing)
        + addition
        - subtraction
        * multiplies
        / divide
        % divide by and find remainder
        += shortcut for adding and reassignment
        Also works for all others: -=, *=, /=
        ++ increments by 1
        -- decrements by 1
        */

        int i = 12;  // assigns 12 to i
        System.out.println(i + 2); // 14
        System.out.println(i); // 12
        System.out.println(i = i + 2);  // 14
        System.out.println(i);  // 14

        i = i + 3;  // Overrides i with a new value


        System.out.println(12 + 12);
        System.out.println(12 * 12);
        System.out.println(12 - 10);
        System.out.println(12 % 5);
//        division of integers will return a truncated integer returning what's before the dot without rounding. A way around this  is to enter one of the 2 numbers to float by adding an F
        System.out.println(12 / 7);
        System.out.println(12 / 7F);

        System.out.print("i:");
        System.out.println(i);
        System.out.print("i+=2:");
        System.out.println(i+=2);
        System.out.print("i++:");  // print THEN increments
        System.out.println(i++);
        System.out.print("++i:");  // increments THEN prints
        System.out.println(++i);
        System.out.print("i--:");
        System.out.println(i--);

//        Adding 2 strings it concatenates them (adds them together)
        System.out.println("Hello " + "World");










    }
}
