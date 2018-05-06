package ua.lviv.iot;

import ua.lviv.iot.item.ShopItem;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;




public final class FishingShop {



    private List<ShopItem> goodList = new LinkedList<>();


    public FishingShop() {
    }


    public List<ShopItem> sortByPrice(final List<ShopItem> result) {
        result.sort(Comparator.comparing(ShopItem::getPrice));
        return result;
    }

    public List<ShopItem> findByGroup(final FishingType goodsType) {
        List<ShopItem> result = new LinkedList<>();
        goodList.stream().filter((goodList) ->
                ((goodList.getFishingtype() == goodsType
                ))).forEachOrdered((goodList) -> {
            result.add(goodList);
        });
        return result;
    }

    public List<ShopItem> getGoodList() {
        return goodList;
    }

    public void setGoodList(final List<ShopItem> goodList) {
        this.goodList = goodList;
    }

    public void addGoods(final ShopItem goods) {
        this.goodList.add(goods);
    }


}


