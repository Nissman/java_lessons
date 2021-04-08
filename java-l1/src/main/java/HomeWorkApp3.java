import java.security.spec.RSAOtherPrimeInfo;

public class HomeWorkApp3 {
    public static void main(String[] args) {
//1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
int[] a = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
a = replaceA(a);
System.out.println();
//2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
int[] b = new int[100];
        for (int i = 0; i < b.length; i++) {
            b[i]=i+1;
        }
        for (int item : b) {
            System.out.print(item + " ");
        }
System.out.println("\n");
//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
 int[] e = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int item : e) {
            System.out.print(item + " ");
        }
System.out.println();
        for (int i = 0; i < e.length; i++) {
            if(e[i]<6) e[i]*=2;
            System.out.print(e[i] + " ");
        }
System.out.println();
/*4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 */
int[][] c = new int[6][6];
System.out.println();
        for (int i = 0; i < c.length; i++) {

            for (int j = 0; j < c.length; j++) {
                if (i==j) c[i][j] = 1;
                if (i== c.length-1-j) c[i][j] = 1;
                System.out.print(c[i][j]);
            }
        System.out.println();
        }
System.out.println();
/*5. Написать метод, принимающий на вход два аргумента: len и initialValue,
и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
*/

int[] d = retIntArr(10,5);
        for (int item : d) {
            System.out.print(item + " ");
        }
System.out.println("\n");
//6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
 int[] f = new int[]{1, 5, 13, 2, 11, 0, 5, 2, 4, 8, 9, 1};
 int max = f[0];
 int min = f[0];
        for (int i = 0; i < f.length ; i++) {
          max = Math.max(max, f[i]);
          min = Math.min(min, f[i]);
          System.out.print(f[i] + " ");
        }
 System.out.printf("\nmax=%d min=%d\n\n",max,min);
/*
7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
если в массиве есть место, в котором сумма левой и правой части массива равны.
**Примеры:
checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1

граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.
 */
int[] arr = new int[]{ 2, 1, 2, 5, 2, 2, 1, 4, 10, 1};

System.out.println(checkBalance(arr)+"\n");
/*
 8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
 при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
  Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
  при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.

Если выполнение задач вызывает трудности, можете обратиться к последней странице методического пособия.
Для задач со * не нужно искать решение в интернете, иначе нет смысла их выполнять.
 */
        int[] arr2 = new int[]{3, 5, 6, 1}; //{ 2, 1, 2, 5, 2, 2, 1, 4, 10, 1};
        for (int i: arr2) {
            System.out.print(i + " ");
        }
        System.out.println();
shiftN(arr2,-2);
    }
public  static  int[] replaceA(int[] a)
{
    for (int item : a) {
        System.out.print(item + " ");
    }
    System.out.println();
    for (int i = 0; i < a.length; i++) {
        if (a[i]==0) a[i]=1;
        else a[i]=0;
    }
    for (int item : a) {
        System.out.print(item + " ");
    }
    System.out.println();
    return a;
}

public static int[] retIntArr(int len, int initialValue){
int[] a = new int[len];
    for (int i = 0; i < a.length ; i++) {
      a[i] = initialValue;
    }
return a;
}

public static boolean checkBalance(int[] arr)
{
boolean flag = false;
int arrSum = 0;
    for (int i: arr) {
        arrSum += i;
    }

int rightSum = 0;
for (int i = 0; i < arr.length; i++){
            rightSum += arr[i];
            if (rightSum == arrSum - rightSum)
            {
                flag = true;

              System.out.println("Найден баланс:");
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j]+" ");
                    if (j==i)  System.out.print(" || ");
                }
                System.out.println();
                break;
            }
        }

        return flag;
    }

public static int[] shiftN(int[] arr, int n){
        int a=0;
    for (int i = 0; i < Math.abs(n); i++) {
        if (n<0){
            for (int j = 0; j < arr.length ; j++) {
                if(j==0){
                 a=arr[j];
                }
                else{
                    arr[j-1]=arr[j];
                }
                if (j+1== arr.length){
                     arr[j]=a;
                }
            }
        }
        else {
            for (int j = arr.length-1; j >=0 ; j--) {
                if(j==arr.length-1){
                    a=arr[j];
                }
                else{
                    arr[j+1]=arr[j];
                }
                if (j-1==-1){
                    arr[j]=a;
                }
            }
        }
        for (int c: arr  ) {
         System.out.print(c + " ");
        }
        System.out.println();
    }

return arr;
}
}
