package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String binaryRegex = "^[01]+$";

        String regexA = "^.{2}0.*";
        String regexB = "^(1*01*01*0)*1*$";
        String regexC = "^(0.*0|1.*1)$";
        String regexD = "^(?:.{2})*.$";
        String regexE = "^(0(?:.{2})*|1(?:.{2})*.)$";
        String regexF = "^.{1,3}$";

        System.out.println("Введите двоичную строку:");
        String input = scanner.nextLine();

        if (!input.matches(binaryRegex)) {
            System.out.println("Ошибка: строка должна содержать только 0 и 1.");
        } else {
        System.out.println("Проверка условий:");
        System.out.println("а) Содержит не менее трех символов, причем третий символ — 0: " + input.matches(regexA));
        System.out.println("б) Количество нулей кратно 3: " + input.matches(regexB));
        System.out.println("в) Начинается и оканчивается одним и тем же символом: " + input.matches(regexC));
        System.out.println("г) Нечетной длины: " + input.matches(regexD));
        System.out.println("д) Начинается с 0 и имеет нечетную длину или с 1 и четную длину: " + input.matches(regexE));
        System.out.println("е) Длина не меньше 1 и не больше 3: " + input.matches(regexF));
        }
        scanner.close();
    }
}
