package rest_tests;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.Response;

@Path("cache-control")
public class CacheControlService {

    @GET
    @Path("{age}")
    public Response getInfo(@PathParam("age") int age){

        CacheControl control = new CacheControl();
        control.setMaxAge(age);
        return Response.ok("Cache max age is " + age).cacheControl(control).build();
    }


}
