package HW6;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
     int n=5;
        ArrayList<Animal> catList = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            catList.add(new Cat("Barsik" +i,n));
            n+=2;

       }
PlateFood plate = new PlateFood(100,100);
        for (Animal cats:catList) {
            System.out.println("Кот " + cats.getName() + " ест "+ cats.getNormEat()+ " единиц еды");
        cats.Eat(plate);
        plate.Info();
        }
        for (Animal cats:catList) {
            System.out.println("Кот " + cats.getName() + " "+cats.getSatiet());

        }
        for (Animal cats:catList) {
            if (!cats.getSatiety())
            {
                System.out.println("Плолжим в миску "+ (cats.getNormEat()- plate.getVolumeFood())+ " единиц еды");

                plate.setVolumeFood(cats.getNormEat()- plate.getVolumeFood());
                plate.Info();
                System.out.println("Кот " + cats.getName() + " ест "+ cats.getNormEat()+ " единиц еды");
                cats.Eat(plate);
                plate.Info();
            }

        }
        for (Animal cats:catList) {
            System.out.println("Кот " + cats.getName() + " "+cats.getSatiet());

        }
    }
}
