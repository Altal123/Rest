package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("users/re")
public class UserRestServiceAndRE {

    @GET
    @Path("{id : \\d+}") //support digit only - here regular expression!
    public Response getUserById(@PathParam("id") String id){

        return Response.status(200).entity("getUserById is called. id:" + id).build();

    }
}
