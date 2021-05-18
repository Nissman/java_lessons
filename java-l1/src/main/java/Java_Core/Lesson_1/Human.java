package Java_Core.Lesson_1;

public class Human implements Do{
    private String name;
    static int maxRun=2;
    static int maxJump=3;

    public Human(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    @Override
    public void run() {
        System.out.println("Человек "+getName()+" бежит");
    }

    @Override
    public void jump() {
        System.out.println("Человек "+getName()+" прыгает");
    }

    @Override
    public void dO(Barier o) {
        if (o.getType()=="track"){
            if (o.GetDistance() <= GetMaxRun()) {
                run();
            }
            else System.out.println("Человек "+getName()+" не может пробежать "+o.GetDistance());

        }
        else if(o.getType()=="wall"){
            if (o.GetDistance() <= GetMaxJump()) {
                jump();
            }
            else System.out.println("Человек "+getName()+" не может прыгнуть "+o.GetDistance());
        }

    }
    @Override
    public int GetMaxJump() {
        return maxJump;
    }

    @Override
    public int GetMaxRun() {
        return maxRun;
    }

    @Override
    public boolean dO2(Barier o) {
        if (o.getType()=="track"){
            if (o.GetDistance() <= GetMaxRun()) {
                run();
            }
            else {
                System.out.println("Для "+getName()+" это предел");
                return false;}
        }
        else if(o.getType()=="wall"){
            if (o.GetDistance() <= GetMaxJump()) {
                jump();
            }

            else{
                System.out.println("Для "+getName()+" это предел");
                return false;}
        }

        return true;

    }
}
