package HW6;

public abstract class Animal {
    static private int countAnimal=0;
    protected String name;
    protected boolean satiety;
    protected int normEat;
    public Animal(String name)
    {
     this.name=name;
     satiety=false;
     countAnimal++;
    }
    public Animal(String name, int normEat)
    {
        this.name=name;
        this.normEat=normEat;
        satiety=false;
        countAnimal++;
    }

    public int getNormEat() {
        return normEat;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
    public boolean getSatiety(){
               return satiety;
    }
public String getSatiet(){
        String satiet;
        if (getSatiety()) satiet="сыт";
        else satiet="голоден";
        return satiet;
}
    public String getName() {
        return name;
    }
    public static int getCountAnimal() {
        return countAnimal;
    }
    public void setName(String name) {
        this.name = name;
    }

    public abstract void Run(int a);
    public abstract void Swim(int a);
    public abstract void Eat(PlateFood a);

}
