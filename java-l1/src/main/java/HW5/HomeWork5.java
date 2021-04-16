package HW5;

public class HomeWork5 {
    public static void main(String[] args) {
        Employee[] empArray = new Employee[5]; // Вначале объявляем массив объектов
        empArray[0] = new Employee();
        empArray[1] = new Employee("Ivanov Ivan Petrobich", "Engineer", "iivan@mailbox.com", "892312312", 35, 35000);
        empArray[2] = new Employee("Cidorov Ivan Ivanovich", "Engineer", "ivan@mailbox.com", "892312312", 41, 40000);
        empArray[3] = new Employee("Petrov Petr Petrovich", "Engineer", "ian@mailbox.com", "892312312", 21, 10000);
        empArray[4] = new Employee("Nikolaev Nikolai Nikolaevich", "Engineer", "in@mailbox.com", "892312312", 50, 80000);

        System.out.println("информация о сотрудниках старше 40 лет");
        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].getAge()>40) empArray[i].printEmpl();
        }
    }
}
