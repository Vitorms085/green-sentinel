package my.project.daos;

import my.project.models.Sensor;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.Arrays;
import java.util.List;

public class SensorDAO {

    @Inject
    private EntityManager em;

    public List<Sensor> listSensorsByCustomer(Long customerId) {
        return Arrays.asList(
                new Sensor(123L, "Modelo 050", 45, 25),
                new Sensor(456L, "Modelo 547", 80, 31),
                new Sensor(789L, "Modelo 87", 20, 27)
        );
    }

    public EntityManager getEm() {
        return em;
    }
}
