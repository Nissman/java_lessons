package Java_Core.Lesson_1;

public class Track implements  Barier{

    static String type="track";
    int distance;

    public Track(int distance){
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
