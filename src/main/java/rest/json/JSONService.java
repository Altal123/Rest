package rest.json;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
//import java.awt.*;

public class JSONService {

    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public Track getTrackinJSON(){

        Track track = new Track();
        track.setTitle("Diesel power");
        track.setGroup("Prodigy");

        return track;
    }

    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createTrackInJson(Track track){

        return Response.status(200).entity(track).build();
    }

}
