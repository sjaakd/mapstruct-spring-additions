package uk.co.kleindelao.mapstruct.spring.example;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Car {
    private String make;
    private SeatConfiguration seatConfiguration;
    private CarType type;
}
