package my.project.resource.api;

import my.project.controllers.SensorControllerApi;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface Api {

    @Path("/sensors")
    SensorControllerApi sensors();
}
