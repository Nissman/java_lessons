package HW5;

public class Employee {
    static private int cnt;
    private int id;
private String fio;
private int age;
private String dol;
private String email;
private String phoneNumber;
private int cash;


public Employee()
{
    cnt++;
   setId(cnt);
    setFio("Иванов Иван Иванович");
    setDol("");
    setEmail("");
    setPhoneNumber("");
    setAge(20);
    setCash(30000);

}
    public Employee(String fio, String dol, String email, String phoneNumber, int age, int cash)
    {
        cnt++;
        setId(cnt);
        setFio(fio);
        setDol(dol);
        setEmail(email);
        setPhoneNumber(phoneNumber);
        setAge(age);
        setCash(cash);
    }
public void printEmpl(){
    System.out.println("Работник{" +
        "ID='" + getId() + '\'' +
                "ФИО='" + getFio() + '\'' +
                ", взраст=" + getAge() +
                ", должность='" + getDol() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", телефон='" + getPhoneNumber() + '\'' +
                ", зарплата=" + getCash() +
                '}');
}
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getCash() {
        return cash;
    }

    public String getDol() {
        return dol;
    }

    public String getEmail() {
        return email;
    }

    public String getFio() {
        return fio;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public void setDol(String dol) {
        this.dol = dol;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Работник{" +
                "ID='" + getId() + '\'' +
                "ФИО='" + getFio() + '\'' +
                ", взраст=" + getAge() +
                ", должность='" + getDol() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", телефон='" + getPhoneNumber() + '\'' +
                ", зарплата=" + getCash() +
                '}';
    }
}
/*
1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
2. Конструктор класса должен заполнять эти поля при создании объекта.
3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
4. Создать массив из 5 сотрудников.
Пример:
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);
 */
