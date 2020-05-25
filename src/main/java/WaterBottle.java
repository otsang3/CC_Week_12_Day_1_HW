public class WaterBottle {

    public WaterBottle(){
        volume = 100;
    }

    private int volume;

    public int getVolume(){
        return volume;
    }

    public void drink(){
        this.volume = volume - 10;
    }

    public void empty(){
        this.volume = 0;
    }

    public void topUp(){
        this.volume = 100;
    }
}
