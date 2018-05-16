package ua.lviv.iot;

import ua.lviv.iot.item.ShopItem;

import java.util.*;


public final class FishingShop {



    private static Map<Integer, ShopItem> shopItemMap = new HashMap<>();


    public FishingShop() {
    }


//    public List<ShopItem> sortByPrice(final List<ShopItem> result) {
//        result.sort(Comparator.comparing(ShopItem::getPrice));
//        return result;
//    }


    public Map<Integer, ShopItem> sortByPrice(int price) {
        Map<Integer, ShopItem> itemList = new HashMap<>();
        for (Map.Entry<Integer,ShopItem> fishingItem: shopItemMap.entrySet()) {

                itemList.put(fishingItem.getKey(), fishingItem.getValue());

        }
        return itemList;
    }



//    public List<ShopItem> findByGroup(final FishingType goodsType) {
//        List<ShopItem> result = new LinkedList<>();
//        goodList.stream().filter((goodList) ->
//                ((goodList.getFishingType() == goodsType
//                ))).forEachOrdered((goodList) -> {
//            result.add(goodList);
//        });
//        return result;
//    }
//
//    public List<ShopItem> getGoodList() {
//        return goodList;
//    }
//
//    public void setGoodList(final List<ShopItem> goodList) {
//        this.goodList = goodList;
//    }

    public void addGoods(final ShopItem goods, Integer id) {
        this.shopItemMap.put(id, goods);
    }

    public static Map<Integer, ShopItem> getGoodList() {
        return shopItemMap;
    }

    public static void setGoodList(Map<Integer, ShopItem> goodList) {
        FishingShop.shopItemMap = goodList;
    }
}


