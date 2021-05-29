package Java_Core.lesson_4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Start {
    /*
    1.Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
    Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
    Посчитать, сколько раз встречается каждое слово.

2.Написать простой класс Телефонный Справочник,
который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи,
а с помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
тогда при запросе такой фамилии должны выводиться все телефоны.
     */
    public static void main(String[] args){
        objective_1();
        System.out.println();
        try {
            objective_2();
        } catch (MyExceptionNumberExist myExceptionNumberExist) {
            myExceptionNumberExist.printStackTrace();
        }
    }

    public static void objective_1(){
        String[] words = ("один понедельник два вторник три среда четые четверг пять пятница шестьодин понедельник" +
                " восемь март девять апрель десять май один понедельник два вторник три среда четые четверг пять пятница шесть" +
                " один понедельник два вторник три среда четые четверг пять пятница шесть" +
                " один понедельник два вторник три среда четые четверг пять пятница шесть" +
                " восемь март девять апрель десять май один понедельник два" +
                " три среда четые четверг пять пятница один понедельник один понедельник" +
                " апрель десять май один понедельник два вторник три среда").split("\\s+");
        Set<String> set = new HashSet(Arrays.asList(words));
        System.out.println(set);
        HashMap<String, Integer> countWord = new HashMap<>();
        for (String word : words){
            if (!countWord.containsKey(word)){
                countWord.put(word, 0);
            }
            countWord.put(word, countWord .get(word) + 1);
        }
        for (String word : countWord.keySet()){
            System.out.println(word + " " + countWord.get(word));
        }
    }

    public static void objective_2() throws MyExceptionNumberExist {
        PhoneDirectory pd=new PhoneDirectory();
        pd.add("Ivanov","+79991235413");
        pd.add("Petrov","123");
        pd.add("Sidorov","124");
        pd.add("Ivanov","+79991235413");
        pd.add("Ivanov","+7999");
       // pd.add("Tarasevich","124");
        pd.add("Tarasevich","1233");
        pd.add("Sidorov","125");
        pd.add("Kim","126");
        pd.add("Sim","127");
        pd.add("Petrov","128");
        pd.get("Ivanov");
        pd.get("Petrov");
        pd.get("Sidorov");
        pd.get("Sim");
        System.out.println("\nВсё:\n");
        pd.getAll();
    }
}
