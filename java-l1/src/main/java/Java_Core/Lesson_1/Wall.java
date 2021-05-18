package Java_Core.Lesson_1;
//Стена
public class Wall implements  Barier{
    static String type="wall";
    int distance;
    public Wall(int distance){
        this.distance=distance;
    }
    @Override
    public int GetDistance() {
        return distance;
    }
    @Override
    public String getType() {
        return type;
    }

}
