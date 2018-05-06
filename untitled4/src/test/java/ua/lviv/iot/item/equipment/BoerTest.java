package ua.lviv.iot.item.equipment;

import junit.framework.TestCase;
import org.junit.Test;


import static ua.lviv.iot.FishingType.WINTER;

public class BoerTest extends TestCase {

    @Test
    public void testGetFishingtype() throws Exception {
        assertEquals(new Boer("Boer", "Acropolis", 10, 100)
                        .getFishingtype().toString(),
                WINTER.toString());
    }


}