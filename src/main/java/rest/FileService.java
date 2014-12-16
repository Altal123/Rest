package rest;

import javax.ws.rs.core.Response.ResponseBuilder;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.io.File;

@Path("file")
public class FileService {

    ClassLoader classLoader = getClass().getClassLoader();

    @GET
    @Path("/get-file") //rest/file/get-file
    @Produces("text/plain") //тип возвращаемого файла от веб-сервиса, в данном случае простой текст.
    public Response getFile(){

        File file = new File(classLoader.getResource("web.txt").getFile());

        ResponseBuilder builder = Response.ok(file);

        builder.header("Context-Disposition", "attachment; filename=\"file_from_server.log\"");

        return builder.build();
    }


}
