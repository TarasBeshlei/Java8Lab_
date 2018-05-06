package ua.lviv.iot.item.rod;

import org.junit.Test;

import static org.junit.Assert.*;
import static ua.lviv.iot.FishingType.SUMMER;

public class SummerRodTest {


    @Test
    public void testGetFishingtype() throws Exception {
        assertEquals(new SummerRod("Summer Rod", "Acropolis", 11, 40)
                        .getFishingtype().toString(),
                SUMMER.toString());
    }
}