package my.project.resources.api;

import my.project.controllers.SensorControllerApi;
import my.project.resource.api.Api;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class ApiImpl implements Api {

    @Inject
    SensorControllerApi sensorController;

    @Override
    public SensorControllerApi sensors() {
        return sensorController;
    }
}
