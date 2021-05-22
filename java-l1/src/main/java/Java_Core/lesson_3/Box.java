package Java_Core.lesson_3;

import java.util.ArrayList;
import java.util.Collections;

public class Box<T extends Fruit>  {
    private ArrayList<T> fruitArrayList = new ArrayList<>();

    public Box() {
    }

    public void addFruitInBox(T... a) {
        Collections.addAll(fruitArrayList, a);

    }

    public ArrayList<T> getFruitArrayList() {
        return fruitArrayList;
    }

    public double getWeight(){
    double boxWeight=fruitArrayList.size()*fruitArrayList.get(0).getWeight();
    return boxWeight;
    }

    public boolean compare(Box <?> box)
    {
    if (this.fruitArrayList.size()==0 | box.fruitArrayList.size()==0 )
        return false;
    else if(box.getWeight()==this.getWeight()){
        return true;
    }
    else return false;
    }

    public void pourItOver(Box <T> box){
    for (int i = 0; i <this.fruitArrayList.size(); i++) {
        box.fruitArrayList.add(this.fruitArrayList.get(i));
    }
    this.fruitArrayList.clear();
    /*
    пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
      Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     */

}


}
