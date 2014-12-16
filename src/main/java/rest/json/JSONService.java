package rest.json;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
//import java.awt.*;

public class JSONService {

    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public Track getTrackInJSON(){

        Track track = new Track();
        track.setTitle("Diesel power");
        track.setGroup("Prodigy");

        return track;
    }

    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)  //На вход метода подается json-файл
    @Produces(MediaType.APPLICATION_JSON)  //На выходе метода получаем json-файл
    public Response createTrackInJson(Track track){

        return Response.status(200).entity(track).build();
    }

}
