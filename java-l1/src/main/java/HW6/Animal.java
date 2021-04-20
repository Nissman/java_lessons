package HW6;

public abstract class Animal {
    static private int countAnimal=0;
    protected String name;
    public Animal(String name)
    {
     this.name=name;
     countAnimal++;
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

}
