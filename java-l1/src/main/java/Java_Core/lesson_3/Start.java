package Java_Core.lesson_3;


import javafx.scene.media.MediaException;

public class Start {
        public static void main(String[] args) {
//задание 1
zadanie_1();
// задание 2
   zadanie_2();


        }
    static void zadanie_1(){
        Integer[] intArray = new Integer[]{1,2,3,4,5,6};
        printArray(intArray);
        swap(0,intArray.length-1,intArray);
        printArray(intArray);
        System.out.println();
        String[] strArray = new String[]{"1","2","3","4"};
        printArray(strArray);
        swap(2,strArray.length-1,strArray);
        printArray(strArray);
        System.out.println();
        String[] strArray1 = new String[]{"1","2","3","4"};
        printArray(strArray1);
        swap(0,strArray1.length-2,strArray1);
        printArray(strArray1);
        System.out.println();
    }
    static void zadanie_2() {
        Box<Apple> apleBox_1= new Box<>();
        Box<Orange> orangeBox_1=new Box<>();
        Box<Apple> apleBox_2= new Box<>();
        Box<Orange> orangeBox_2=new Box<>();
        apleBox_1.addFruitInBox(new Apple());
        apleBox_2.addFruitInBox(new Apple());
        orangeBox_1.addFruitInBox(new Orange());
        System.out.println(apleBox_1.compare(orangeBox_1));
        System.out.println(apleBox_1.compare(apleBox_2));
        System.out.println(apleBox_1.getFruitArrayList().toString());
        System.out.println(apleBox_2.getFruitArrayList().toString());
        apleBox_1.pourItOver(apleBox_2);
        System.out.println(apleBox_1.getFruitArrayList().toString());
        System.out.println(apleBox_2.getFruitArrayList().toString());
        //apleBox_1.addFruitInBox(new Orange()); //ошибка
        // apleBox_1.pourItOver(orangeBox_1);     //ошибка

  /*
        Box<Apple> apleBox_1= new Box<>();
        apleBox_1.addFruitInBox(new Apple(), new Apple(), new Apple());
        System.out.println(apleBox_1.getFruitArrayList());
        apleBox_1.addFruitInBox(new Apple());
        System.out.println(apleBox_1.getFruitArrayList());

   */
        System.out.println();
    }

    static <T>void printArray(T[] arrays){
        for (T array:arrays) {
            System.out.print(array+" ");
        }
        System.out.println();

    }
static <T>void swap(int index_1, int index_2, T[] a){
T b = a[index_1];
a[index_1]=a[index_2];
a[index_2]=b;
}
}
