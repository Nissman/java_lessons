public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println("Метод compareSum() вернул " +compareSum(10,10) );
        System.out.print("Метод positivOrNegative(): ");
        positivOrNegative(1000);
        System.out.println("Метод positivOrNegativeNoSOUT() вернул " +positivOrNegativeNoSOUT(-1) );
        printNString("hello", 5);
        System.out.println("Метод chekYear() вернул " +chekYear(2028));

    }

    public static boolean compareSum(int a, int b)
    {
        boolean flag= false;
        if (a+b>=10 && a+b<=20) flag=true;
        return  flag;
    }

    public static void positivOrNegative(int a)
    {
        String pon="отрицательное";
        if (a>=0) pon="положительное";
        System.out.println("Передано " +pon + " число");
    }

    public static boolean positivOrNegativeNoSOUT(int a)
    {
        boolean pon=false;
        if (a<0) pon=true;
        return  pon;
    }
    public static void printNString(String str, int a)
    {
        System.out.println("Метод printNString(): печать строки \""+str+"\" " + a + "раз");
        for (int i = 0; i < a ; i++)
        {
            System.out.println(str);
        }
    }

    public static boolean chekYear(int year)
    {
        boolean flag = false;
        if (year%400 ==0) flag = true;
        else if (year%4==0 && year%100!=0) flag = true;
        else flag= false;
        return flag;
    }

}
/*1. Написать метод, принимающий на вход два целых числа и проверяющий,
что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

  2. Написать метод, которому в качестве параметра передается целое число,
  метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

  3. Написать метод, которому в качестве параметра передается целое число.
  Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

  4. Написать метод, которому в качестве аргументов передается строка и число,
  метод должен отпечатать в консоль указанную строку, указанное количество раз;

  5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false).
   Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

        */
