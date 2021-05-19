package Java_Core.Lesson_2;
/*
1. Написать метод, на вход которому подается двумерный строковый массив размером 4х4.
 При подаче массива другого размера необходимо бросить исключение MySizeArrayException.

2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
Если в каком-то элементе преобразование не удалось (например, если в ячейке лежит символ или текст вместо числа),
надо бросить исключение MyArrayDataException с детализацией, в какой ячейке неверные данные.

3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException и вывести результат расчета.
 */
public class ExceptionHomeWork {
    public static void main(String[] args) {

        String[][] array = createArray();
        try {
            summingElements(array);
        } catch (MySizeArrayException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

static String[][] createArray(){
        String[][] str = {{"1","2","3","4"},
                {"5","6","7","f",},
                {"9","10","j","3",},
                {"13","14","15","3",}};

return str;
}
    static void summingElements(String[][] array) throws MySizeArrayException, MyArrayDataException {

        if (array.length!=4 | array[0].length!=4)
        {
        throw new MySizeArrayException("Несоответсвие размера массива! Ожидалась матрица 4х4... Исправте матрицу и пропробуйте снова");
        }
        int result=0;
        int StI;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j <array[i].length;  j++) {
                try {
                    StI=Integer.parseInt(array[i][j].trim());
                    result+=StI;
                    }
                catch (NumberFormatException e) {
                throw new MyArrayDataException("В ячейке ["+i+"] ["+j+"]  находится не числовое значение", result);}
                 }
        }
    System.out.println(result);
    }
}

