package my.project.controllers;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface SensorControllerApi {

    @GET
    @Path("{customerId}")
    Response listSensors(@PathParam("customerId") Long customerId);
}
