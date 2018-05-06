package ua.lviv.iot.item.writer;

import ua.lviv.iot.item.ShopItem;

import java.io.*;
import java.util.List;

public class ShopWriter {

    public final void writeToFile(final List<ShopItem> decorationList)
            throws IOException {
        File file = new File("Shop.csv");
        if (!file.exists()) {
            file.createNewFile();
        }

        try (OutputStream stream = new FileOutputStream(file);
             PrintWriter writer = new PrintWriter(stream)) {
            writer.println(decorationList.get(0).getHeaders());
            for (ShopItem shopItem : decorationList) {

                writer.println(shopItem.toCSV());

            }
        } catch (IOException e) {
            throw e;
        }
    }
}
