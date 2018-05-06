package ua.lviv.iot.item.rod;

import org.junit.Test;
import ua.lviv.iot.item.equipment.Hook;

import static org.junit.Assert.*;

import static ua.lviv.iot.FishingType.SPRING;

public class SpringRodTest {


    @Test
    public void testGetFishingtype() throws Exception {
        assertEquals(new SpringRod("Spring Rod", "Hunter", 14, 80)
                        .getFishingtype().toString(),
                SPRING.toString());
    }

}