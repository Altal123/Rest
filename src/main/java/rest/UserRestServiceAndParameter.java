package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("users/parameter")
public class UserRestServiceAndParameter {
    @GET
    @Path("{name}")
    public Response getUserByName(@PathParam("name") String name){

        return Response.status(200).entity("getUserByName is called, name : " + name).build();

    }

    @GET
    @Path("{year}/{month}/{day}")
    public Response getUserHistory(
            @PathParam("year") int year,
            @PathParam("month") int month,
            @PathParam("day") int day){

        String date = year + "/" + month + "/" + day;

        return Response.status(200).entity("getUserHistory is called, year.month, day: " + date).build();
    }

}
