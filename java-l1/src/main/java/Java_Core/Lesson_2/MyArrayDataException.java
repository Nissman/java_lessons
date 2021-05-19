package Java_Core.Lesson_2;

public class MyArrayDataException extends Exception{
    public MyArrayDataException(String message, int result){
        super(message);
        System.out.println("результат суммирования до ошибки: "+result);
    }

}
