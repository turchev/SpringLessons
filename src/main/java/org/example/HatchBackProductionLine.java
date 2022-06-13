package org.example;

import org.example.dto.Car;

public class HatchBackProductionLine implements ProductionLine {
    @Override
    public Car work() {
        return new Car("2102", "Красный", "Хэтчбек");
    }
}
