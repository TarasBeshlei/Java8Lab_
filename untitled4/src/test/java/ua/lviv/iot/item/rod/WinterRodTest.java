package ua.lviv.iot.item.rod;

import org.junit.Test;

import static org.junit.Assert.*;
import static ua.lviv.iot.FishingType.SUMMER;

public class WinterRodTest {
    @Test
    public void testGetFishingtype() throws Exception {
        assertEquals(new WinterRod("Winter Rod", "Fisher", 20, 50)
                        .getFishingtype().toString(),
                SUMMER.toString());
    }

}