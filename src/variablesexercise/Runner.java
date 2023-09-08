package variablesexercise;

public class Runner {
    public static void main(String[] args) {
//        String firstName = "Sara";
//        String lastName = "Bonnin";
//
//        String name = firstName + " " + lastName;
//
//        System.out.println(name);

        int num1 = 10;
        int num2 = 3;

        System.out.println(num1 + num2);

        float result = (float) num1 /num2;  // IJ suggestion, not mine :)
        System.out.println(result);

        int num3 = 8;

        System.out.println(num3++); // prints 1st, then adds
        System.out.println(num3);  // prints num
        System.out.println(++num3); // 1st adds, then prints


    }
}
