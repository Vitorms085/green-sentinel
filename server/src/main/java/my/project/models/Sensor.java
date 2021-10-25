package my.project.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Sensor extends BaseModel {

    private Long serialNumber;

    private String modelo;

    private Integer currentHumidity;

    private Integer currentTemp;
}
