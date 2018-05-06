package ua.lviv.iot.item.rod;

import org.junit.Test;

import static org.junit.Assert.*;
import static ua.lviv.iot.FishingType.AUTUMN;

public class AutumnRodTest {

    @Test
    public void testGetFishingtype() throws Exception {
        assertEquals(new AutumnRod("Autumn Rod", "Fisher", 2, 20).getFishingtype()
                .toString(), AUTUMN.toString());
    }

}