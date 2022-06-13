package org.example;

import org.example.dto.Car;

public class SedanProductionLine implements ProductionLine {
    @Override
    public Car work() {
        return new Car("2101", "Белый", "Седан");
    }
}
