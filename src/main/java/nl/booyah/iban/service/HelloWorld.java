package nl.booyah.iban.service;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorld {

    @GET
    @Path("/{param}")
    public Response responseMsg(@PathParam("param") String name, @DefaultValue("Hello") @QueryParam("prefix") String prefix) {
        String response = prefix + " " + name;
        return Response.ok(response).build();
    }
}
