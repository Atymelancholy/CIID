package org.example;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        String[] testStrings = {"101",
                                "1101",
                                "111",
                                "000",
                                "11",
                                "1111",
                                "00100"};

        String regexA = "^(?!11$|111$)[01]*$";
        String regexB = "^(1[01])*1?$";
        String regexC = "^(?=.*0.*0)[01]*1?[01]*$";
        String regexD = "^(?!.*11)[01]*$";

        System.out.println("a) Все строки кроме 11 и 111:");
        testRegex(regexA, testStrings);

        System.out.println("b) Строки с единицами в каждой нечетной битовой позиции:");
        testRegex(regexB, testStrings);

        System.out.println("c) Строки с не менее двумя нулями и не более чем одной единицей:");
        testRegex(regexC, testStrings);

        System.out.println("d) Строки без двух единиц подряд:");
        testRegex(regexD, testStrings);
    }

    public static void testRegex(String regex, String[] testStrings) {
        Pattern pattern = Pattern.compile(regex);
        for (String str : testStrings) {
            Matcher matcher = pattern.matcher(str);
            System.out.println(str + " : " + matcher.matches());
        }
    }
}

