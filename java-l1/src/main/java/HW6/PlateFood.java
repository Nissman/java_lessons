package HW6;

public class PlateFood {
    private int count=0;
    private int ID;
    private int volume;
    private int volumeFood;
    public PlateFood(int a, int b){
       count++;
       ID=count;
       volume=a;
       if (b>a) volumeFood=volume;
       else volumeFood=b;
    }
    public void consumption(int normEat){
        if (volumeFood>=normEat) volumeFood-=normEat;

    }
public void Info(){
    System.out.println("Количество еды: " + getVolumeFood());
}

    public int getVolumeFood() {
        return volumeFood;
    }

    public void setVolumeFood(int volumeFood) {
        if (this.volume>=volumeFood) {
            if (this.volumeFood+volumeFood<=this.volume) this.volumeFood += volumeFood;
            else this.volumeFood=volume;
        }
        else this.volumeFood=volume;


    }
}
