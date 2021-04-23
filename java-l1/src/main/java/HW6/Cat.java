package HW6;

public class Cat extends Animal{
    static private int countCat=0;

    public Cat(String name){
        super(name);
        countCat++;
        normEat=25;
    }
    public Cat(String name, int normEat){
        super(name, normEat);
        countCat++;
         }
    public static int getCountCat() {
        return countCat;
    }

    @Override
    public void Run(int a) {
    if (a<=0) System.out.println("Кот "+ this.getName()+"  отдыхает");
    else if (a>200) System.out.println("Кот "+ this.getName()+"  пробежал 200 метров и устал, дистанция в "+ a + " для него тяжеловата");
    else System.out.println("Кот "+ this.getName()+"  пробежал "+a+" метров");
    }

    @Override
    public void Swim(int a) {
        System.out.println("Кот "+ this.getName()+" не умеет плавать :(");
    }

    @Override
    public void Eat(PlateFood p)
    {
        if (getSatiety()) {}
            else if (this.normEat<=p.getVolumeFood()){
            p.consumption(normEat);
            setSatiety(true);
        }
            else {System.out.println("Для кота " +this.getName()+" этого слишком мало");}

    }
}
