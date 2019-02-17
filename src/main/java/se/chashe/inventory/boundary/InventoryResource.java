package se.chashe.inventory.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *Inventory API
 */
@Path("inventory")
public class InventoryResource {

    @GET
    public String inventory() {
        return "Enjoy Java EE 8!";
    }

}
