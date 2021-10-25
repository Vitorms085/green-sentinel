package my.project.controllers;

import my.project.business.SensorBusiness;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@ApplicationScoped
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SensorController implements SensorControllerApi {

    @Inject
    SensorBusiness business;

    @Override
    public Response listSensors(Long customerId) {
        try {
            return Response.ok(business.listSensorsByCustomerId(customerId)).build();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }
}
