package ua.lviv.iot;

import ua.lviv.iot.item.ShopItem;
import ua.lviv.iot.item.equipment.Boer;
import ua.lviv.iot.item.equipment.Coil;
import ua.lviv.iot.item.equipment.Float;
import ua.lviv.iot.item.equipment.Hook;
import ua.lviv.iot.item.rod.AutumnRod;
import ua.lviv.iot.item.rod.SpringRod;
import ua.lviv.iot.item.rod.SummerRod;
import ua.lviv.iot.item.rod.WinterRod;

import java.util.List;

public class Main {

    public static void printList(final List<ShopItem> list) {
            System.out.println(list);
    }



    public static void main(final String[] args) {

        FishingShop equipment = new FishingShop();

        equipment.addGoods(new AutumnRod("Autumn Rod", "Fisher", 2, 20), 23);
//        equipment.addGoods(new SpringRod("Spring Rod", "Hunter", 14, 80));
//        equipment.addGoods(new SummerRod("Summer Rod", "Acropolis", 11, 40));
//        equipment.addGoods(new WinterRod("Winter Rod", "Fisher", 20, 50));
//        equipment.addGoods(new Hook("Hook", "Hunter", 70, 10));
//        equipment.addGoods(new Boer("Boer", "Acropolis", 10, 100));
//        equipment.addGoods(new Coil("Coil", "Hunter", 40, 80));
//        equipment.addGoods(new Float("Float", "Fisher", 100, 12));
//
//        printList(equipment.getGoodList());
//        printList(equipment.sortByPrice(equipment.getGoodList()));
//
//        System.out.println("\nList of searched goods:\n");
//        List<ShopItem> result = equipment.findByGroup(FishingType.SUMMER);
//        printList(result);



    }
}
