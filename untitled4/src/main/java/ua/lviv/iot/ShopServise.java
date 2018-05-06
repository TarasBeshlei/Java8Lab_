package ua.lviv.iot;

import ua.lviv.iot.item.equipment.Boer;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;


@Path("/shopItems")
public class ShopServise {

    private static Map<Integer, Boer> boers = new HashMap<>();

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Boer getBor(@PathParam("id") Integer id) {
        return boers.get(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void createToy(Boer boer) {
        boers.put(boer.getId(), boer);
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void replaceToy(@PathParam("id") Integer id, Boer boer) {
        boers.replace(id, boer);
    }

    @DELETE
    @Path("/{id}")
    public void deleteToy(@PathParam("id") Integer position) {
        boers.remove(position);
    }

}
