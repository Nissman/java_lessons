package HW6;

public class test {
    public static void main(String[] args) {
        Animal cat = new Cat("s");
        Animal dogBobik = new Dog("Bobik");
        Animal catBarsik = new Cat("Barsik");
        System.out.printf("Всего животных: %d \nВсего котов: %d \nВсего собак: %d\n", Animal.getCountAnimal(), Cat.getCountCat(), Dog.getCountDog());
        catBarsik.Run(-1);
        catBarsik.Run(0);
        catBarsik.Run(1);
        catBarsik.Run(199);
        catBarsik.Run(200);
        catBarsik.Run(201);
        catBarsik.Swim(2);

        dogBobik.Run(-1);
        dogBobik.Run(0);
        dogBobik.Run(1);
        dogBobik.Run(499);
        dogBobik.Run(500);
        dogBobik.Run(501);
        dogBobik.Swim(-1);
        dogBobik.Swim(0);
        dogBobik.Swim(1);
        dogBobik.Swim(9);
        dogBobik.Swim(10);
        dogBobik.Swim(11);


    }
}
