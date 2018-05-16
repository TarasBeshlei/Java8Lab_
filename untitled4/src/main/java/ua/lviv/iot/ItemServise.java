package ua.lviv.iot;

import ua.lviv.iot.item.ShopItem;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Path("/shopItems")
public class ItemServise implements Serializable {

    private static Map<Integer, ShopItem> shopItemMap = new HashMap<>();

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public final ShopItem getShopItem(final @PathParam("id") Integer id) {
        return shopItemMap.get(id);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response createGood(final ShopItem shopItem) {
        shopItemMap.put(shopItem.getId(), shopItem);
        return Response.status(200).entity("Items").build();
    }

    @DELETE
    @Path("/{id}")
    public final Response deleteGood(final @PathParam("id") Integer id) {
        shopItemMap.remove(id);
        return Response.status(200).entity("Item").build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response replaceGood(final ShopItem shopItem) {
        shopItemMap.replace(shopItem.getId(), shopItem);
        return Response.status(200).entity("Items").build();
    }

}

