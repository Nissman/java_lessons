package Java_Core.lesson_4;

import java.util.*;

public class PhoneDirectory {
    private HashMap<String, Set<String>> HMphoneDirectory= new LinkedHashMap<>();

    public void add(String name, String phone) throws MyExceptionNumberExist {
        if (!check(name, phone)){
            throw new MyExceptionNumberExist("Добавляемый номер телефона "+ phone + " пользователю " + name + " уже существует!");
        }
        else {
            Set<String> number = new HashSet<>();
            if (HMphoneDirectory.containsKey(name)) {
                number.addAll(HMphoneDirectory.get(name));
            }
            number.add(phone);
            HMphoneDirectory.put(name, number);
        }
    }

    public void get(String name){
        if (HMphoneDirectory.containsKey(name)){
            System.out.println(name + ": " + HMphoneDirectory.get(name));
        }
        else System.out.println("В списке нет такой фамилии!");
    }

    public void getAll(){
        Set<String> keySet=HMphoneDirectory.keySet();
        for (String name:keySet){
            get(name);
        }
    }

    private boolean check(String mainNAme, String phone){
        if (!HMphoneDirectory.isEmpty()){
            List<String> nameList = new LinkedList<>(HMphoneDirectory.keySet());
            for (String name: nameList) {
                if (mainNAme != name & HMphoneDirectory.get(name).contains(phone)){
                    return false;
                }
            }
        }
        return true;
    }
    /*
    2. Написать простой класс Телефонный Справочник,
который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи,
а с помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
тогда при запросе такой фамилии должны выводиться все телефоны.
     */
}
