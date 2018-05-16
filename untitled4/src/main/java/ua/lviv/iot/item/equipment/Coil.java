package ua.lviv.iot.item.equipment;

import ua.lviv.iot.FishingType;
import ua.lviv.iot.item.ShopItem;

public class Coil extends ShopItem {



    private final FishingType fishingtype = FishingType.SUMMER;

    public Coil(final String name, final String brand,
                final int amount, final int price) {
        super(name, brand, amount, price);
//        this.name = name;
//        this.brand = brand;
//        this.price = price;
//        this.amount = amount;
    }
    public FishingType getFishingType() {
        return fishingtype;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders();
    }

    @Override
    public String toCSV() {
        return super.toCSV();
    }
}
