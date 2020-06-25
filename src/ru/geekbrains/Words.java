package ru.geekbrains;

import java.util.*;

public class Words {
    public static void words() {

        /**1. "Короткий способ печати через Карту и Сет"
         * 2. "Сложный и длинный метод использующий только одну карту"
         */
//        Random random = new Random();
//
//        Map<String, Integer> randomWords = new HashMap<>();
//        Set<String> randomWords2 = new HashSet<>();
//
//        for (int i = 0; i < 20; i++) {
//            String key = "слово" + random.nextInt(10);
//            Integer res = randomWords.get(key);
//
//            randomWords.put(key, res == null ? 1 : res + 1);
//            randomWords2.add(key);
//        }
//
//        System.out.println(randomWords);
//        System.out.println(randomWords2);
//    }

    Random random = new Random();
        System.out.println();
    HashMap<String, Integer> randomWords = new HashMap<>();
        for (int i = 0; i < 20; i++) {
        String key = "слово" + random.nextInt(10);
        Integer res = randomWords.get(key);
        randomWords.put(key, res == null ? 1 : res + 1);
    }
        Set<Map.Entry<String, Integer>> allOfTheWords = randomWords.entrySet();
        String uniqueWords = "Уникальный список: ";

        for(Map.Entry<String, Integer> unique: allOfTheWords)
        {
            String key = unique.getKey();
            uniqueWords+=key+" ";
            Integer value = unique.getValue();
            System.out.println(key + " --> " + value);
        }

        System.out.println("\n"+uniqueWords+"\n");
}
}
