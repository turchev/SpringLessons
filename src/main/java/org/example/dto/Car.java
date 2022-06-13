package org.example.dto;

public class Car {
    private final String model;
    private final String color;
    private final String type;

    public Car(String model, String color, String type) {
        this.model = model;
        this.color = color;
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("Модель: ВАЗ-%s, Тип кузова: %s, Цвет: %s",
                model == null ? "0000" : model,
                type == null ? "0000" : type,
                color == null ? "" :color);
    }

}
