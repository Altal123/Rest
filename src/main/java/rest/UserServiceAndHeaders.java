package rest;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

@Path("users")
public class UserServiceAndHeaders {

    @GET
    @Path("get-user-agent")
    public Response addUser (@HeaderParam("user-agent") String userAgent){

        return Response.status(200).entity("addUser is called, user-agent : " + userAgent).build();
    }

    @GET
    @Path("/get-headers")
    public Response addUser (@Context HttpHeaders headers){   //видає всі н

        String userAgent = headers.getRequestHeader("user-agent").get(0);

        return Response.status(200).entity("addUser is called, user-agent : " + userAgent).build();
    }

}
