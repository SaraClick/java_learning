package conditionals;

public class Runner {

    public static void main(String[] args) {
        boolean condition = false;

        // some code setting the condition to true/false

        if (condition) {
            System.out.println("Was true");
        } else {
            System.out.println("Was false");
        }
        int num = 41;
        if (num % 2 == 0) {
            System.out.println("Is even!");
            if (num > 10) System.out.println("> 10");
        } else System.out.println("Is odd!");

        if (num > 30) System.out.println("> 30");
        else if (num > 20) System.out.println("> 20");
        else System.out.println(">= 20");

        // runs if both conditions are true
        if (num > 30 && num % 2 == 0) {
            System.out.println("> 30 AND even");
            int i = 27; // scoped to the if block
//         runs if either condition is true
        } else if (num > 30 || num % 2 == 0) {
            System.out.println("> 30 OR even");
        }
//        can't access i as it is out of scope
//        System.out.println("I? " + i);

        String name = "jordan";

        if (name != null && !name.isBlank())
            System.out.println("Hello, my name is " + name);
        else
            System.out.println("I am the man with no name");

        String dayOfWeek = "dfsfg";
//      if (dow == mon || dow == tues || wed ...) sout(work);
//        else if(dow == sat || sun) sout(slep)
        switch (dayOfWeek) {
            // if dayOfWeek == Monday
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("I work");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("I slep");
                break;
            default:
                System.out.println("Invalid day: " + dayOfWeek);
        }
    }
}