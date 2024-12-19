package org.example;

import java.util.*;

public class Main{

    public static void main(String[] args) {
        List<String> words = Arrays.asList("курдуплик", "урдуплик", "рдуплик", "дуплик",
                "уплик", "плик", "лик", "ик", "к");

        SubstringSearchAPI api = new SubstringSearchAPI(words);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите подстроку для поиска: ");
        while (scanner.hasNext()) {
            String query = scanner.nextLine();
            if (query.equalsIgnoreCase("-1")) {
                break;
            }
            Set<String> results = api.searchSubstring(query);
            System.out.println("Результаты: " + (results.isEmpty() ? "Ничего не найдено" : results));
            System.out.println("Введите следующую подстроку (или '-1' для выхода): ");
        }
        scanner.close();
    }
}

