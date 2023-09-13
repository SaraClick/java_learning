package morsetranslator;

import java.util.*;

public class Translator {
    public static void main(String[] args) {

    Map<String, String> morseToEnglish = new HashMap<>();
    List<String> morse = List.of(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---",
            ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..");

    String[] secret = ".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-".split(" ");

        System.out.println(Arrays.toString(secret));
       for (int i=0; i < morse.size(); i++) {
           morseToEnglish.put(morse.get(i), String.valueOf((char) (97 + i)));
        }
            // System.out.println(morseToEnglish);

       for(String s:secret){
           System.out.println((morseToEnglish.get(s)));
       }
    }
}
