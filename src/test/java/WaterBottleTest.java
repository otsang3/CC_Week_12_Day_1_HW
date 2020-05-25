import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before(){
        waterbottle = new WaterBottle();
    }

    @Test
    public void canGetVolume(){
        int volume = waterbottle.getVolume();
        assertEquals(100, volume);
    }

    @Test
    public void canDrink() {
        waterbottle.drink();
        int totalVolume = waterbottle.getVolume();
        assertEquals(90, totalVolume);
    }

    @Test
    public void emptyBottle(){
        waterbottle.empty();
        int totalVolume = waterbottle.getVolume();
        assertEquals(0, totalVolume);
    }

    @Test
    public void topUp(){
        waterbottle.topUp();
        int totalVolume = waterbottle.getVolume();
        assertEquals(100, totalVolume);
    }

}
