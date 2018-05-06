package ua.lviv.iot;

import org.junit.Before;
import org.junit.Test;
import ua.lviv.iot.item.ShopItem;
import ua.lviv.iot.item.equipment.Boer;
import ua.lviv.iot.item.equipment.Coil;
import ua.lviv.iot.item.equipment.Float;
import ua.lviv.iot.item.equipment.Hook;
import ua.lviv.iot.item.rod.AutumnRod;
import ua.lviv.iot.item.rod.SpringRod;
import ua.lviv.iot.item.rod.SummerRod;
import ua.lviv.iot.item.rod.WinterRod;
import ua.lviv.iot.item.writer.ShopWriter;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

import static ua.lviv.iot.FishingType.SUMMER;

public class FishingShopTest {

    private FishingShop shop = null;

    @Before
    public void setUp() {


        shop = new FishingShop();
        shop.addGoods(new SummerRod("TestRodName", "TestBrand", 32, 123));
        shop.addGoods(new Boer("Boer", "BoerBrand", 22, 163));
        shop.addGoods(new Coil("Coil", "CoilBrand", 39, 90));
        shop.addGoods(new Float("Float", "FloatBrand", 100, 5));
        shop.addGoods(new Hook("Hook", "HookBrand", 200, 7));
        shop.addGoods(new AutumnRod("AutumnRod", "RodBrand", 12, 350));
        shop.addGoods(new WinterRod("WinterRod", "RodBrand", 23, 400));
        shop.addGoods(new SpringRod("SpringRod", "RodBrand", 24, 250));

    }

    @Test
    public void testSortByPrice()  {


        List<ShopItem> testList = shop.getGoodList();


        testList = shop.sortByPrice(testList);

        assertEquals(5, testList.get(0).getPrice(), 0.0001);
        assertEquals(7, testList.get(1).getPrice(),0.0001);
        assertEquals(90, testList.get(2).getPrice(),0.0001);
        assertEquals(123, testList.get(3).getPrice(),0.0001);
        assertEquals(163, testList.get(4).getPrice(),0.0001);
        assertEquals(250, testList.get(5).getPrice(),0.0001);
        assertEquals(350, testList.get(6).getPrice(),0.0001);
        assertEquals(400, testList.get(7).getPrice(),0.0001);
    }

    @Test
    public void testFindByGroup() {

        List<ShopItem> result = shop.findByGroup(SUMMER);;
        assertEquals(3, result.size());

    }

    @Test
    public void writeToFile() {
        try {
            ShopWriter shopWriter = new ShopWriter();
            shopWriter.writeToFile(shop.getGoodList());
        } catch (IOException e) {
            assertTrue(false);
        }
        File file = new File("Shop.csv");
        assertEquals(true, file.exists());
    }
}