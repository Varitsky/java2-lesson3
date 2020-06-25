package ru.geekbrains;

import java.util.*;

import static ru.geekbrains.Words.words;

public class Main {

    public static void main(String[] args) {

/**
 * 1. Вызов words, случайного списка слов и подсчёта повторяющихся значений.
 * 2. Закомментированый код телефонной книги где к одной фамилиии только один номер телефона.
 * 3. Телефонная книга в которой к одной фамилии может быть несколько телефонных номеров.
 * */

/**1.:
 */
        words();

/**2.:
*/

//        YellowPages yellowPages = new YellowPages();
//
//        yellowPages.addContact("Гумилев", 89260000005L);
//        yellowPages.addContact("Волошин", 89260000006L);
//        yellowPages.addContact("Волошин", 89260000016L);
//
//        yellowPages.getPhoneNumber("Волошин");
//
//    }
//
//}
//class YellowPages {
//    HashMap<String, Long> yellowPages;
//
//    public YellowPages() {
//        this.yellowPages = new HashMap<>();
//        yellowPages.put("Дантес", 89260000001L);
//        yellowPages.put("Мартынов", 89260000002L);
//        yellowPages.put("Пушкин", 89260000003L);
//        yellowPages.put("Лермонтов", 89260000004L);
//    }
//
//
//    public void getPhoneNumber(String name) {
//        System.out.println("Номер телефона для фамилии " + name + ": " + yellowPages.getOrDefault(name, 0L));
//    }
//
//    public void addContact(String name, Long phoneNumber){
//        yellowPages.put(name, phoneNumber);
//    }
/**3.:
*/

        Phonebook yellowPages = new Phonebook();

        yellowPages.add("Дантес", 89260000001L);
        yellowPages.add("Пушкин", 89260000003L);
        yellowPages.add("Мартынов", 89260000002L);
        yellowPages.add("Лермонтов", 89260000004L);
        yellowPages.add("Пушкин", 89260000033L);


        String surname = "Пушкин";
        System.out.println("Все номера телефонов для фамилии " + surname + ": " + yellowPages.get(surname));
    }

    public static class Phonebook {
        private Map<String, HashSet<Long>> yellowPages;

        Phonebook() {
            this.yellowPages = new HashMap<>();

        }

        void add(String lastName, Long phone) {
            HashSet<Long> phoneNumbers;

            if (yellowPages.containsKey(lastName)) {
                phoneNumbers = yellowPages.get(lastName);
            } else {
                phoneNumbers = new HashSet<>();
            }
            phoneNumbers.add(phone);
            yellowPages.put(lastName, phoneNumbers);
        }

        HashSet<Long> get(String lastName) {
            return yellowPages.get(lastName);
        }
    }
}



