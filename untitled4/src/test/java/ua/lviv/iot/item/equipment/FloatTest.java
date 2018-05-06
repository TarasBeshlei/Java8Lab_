package ua.lviv.iot.item.equipment;

import org.junit.Test;

import static org.junit.Assert.*;
import static ua.lviv.iot.FishingType.SPRING;

public class FloatTest {


    @Test
    public void testGetFishingtype() throws Exception {
        assertEquals(new Float("Float", "Fisher", 100, 12)
                        .getFishingtype().toString(),
                SPRING.toString());
    }

}