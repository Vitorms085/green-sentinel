package my.project.business;

import my.project.daos.SensorDAO;
import my.project.models.Sensor;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class SensorBusiness {

    @Inject
    SensorDAO sensorDAO;

    public List<Sensor> listSensorsByCustomerId(Long customerId) {
        return sensorDAO.listSensorsByCustomer(customerId);
    }
}
