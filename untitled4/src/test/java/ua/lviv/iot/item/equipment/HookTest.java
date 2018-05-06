package ua.lviv.iot.item.equipment;

import org.junit.Test;

import static org.junit.Assert.*;
import static ua.lviv.iot.FishingType.AUTUMN;

public class HookTest {

    @Test
    public void testGetFishingtype() throws Exception {
        assertEquals(new Hook("Float", "Fisher", 100, 12)
                        .getFishingtype().toString(),
                AUTUMN.toString());
    }

}