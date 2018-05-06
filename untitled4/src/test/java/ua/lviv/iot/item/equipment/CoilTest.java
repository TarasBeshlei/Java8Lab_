package ua.lviv.iot.item.equipment;


import org.junit.Test;


import static org.junit.Assert.*;
import static ua.lviv.iot.FishingType.SUMMER;


public class CoilTest {

    @Test
    public void testGetFishingtype() throws Exception {
        assertEquals(new Coil("Coil", "Hunter", 40, 80)
                        .getFishingtype().toString(),
                SUMMER.toString());
    }

}