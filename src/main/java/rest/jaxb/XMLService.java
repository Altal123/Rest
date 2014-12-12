package rest.jaxb;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.*;

@Path("xml/customer")
public class XMLService {

    @GET
    @Path("/{pin}")
    @Produces(MediaType.APPLICATION_XML)
    public Customer getCustomerInXml(@PathParam("pin") int pin){

        Customer customer = new Customer();
        customer.setName("Sergii Oliynik");
        customer.setPin(pin);

        return customer;
    }
}