package HW6;

public class Dog extends Animal{
    static private int countDog=0;
    public Dog(String name){
        super(name);
        countDog++;
    }



    public static int getCountDog() {
        return countDog;
    }

    @Override
    public void Run(int a) {
        if (a<=0) System.out.println("Собакен "+ this.getName()+" отдыхает");
        else if (a>500) System.out.println("Собакен "+ this.getName()+" пробежал 500 метров и устал, дистанция в "+ a + " метров для него тяжеловата");
        else System.out.println("Собакен "+ this.getName()+"пробежал "+a+" метров");
    }

    @Override
    public void Swim(int a) {
        if (a<=0) System.out.println("Собакен "+ this.getName()+" отдыхает");
        else if (a>10) System.out.println("Собакен "+ this.getName()+" проплыл 10 метров и устал, дистанция в "+ a + " метров для него тяжеловата");
        else System.out.println("Собакен "+ this.getName()+" проплыл "+a+" метров");
    }

    @Override
    public void Eat(PlateFood a) {

    }
}
