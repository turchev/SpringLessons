package org.example;

import org.example.dto.Car;

public class AutoFactory {

    private final int carsCount;
    private final ProductionLine productionLine;

    public AutoFactory(int carsCount, ProductionLine productionLine) {
        this.carsCount = carsCount;
        this.productionLine = productionLine;
    }

    public void run() {
        int carBuild = 0;
        while (carBuild < carsCount) {
            Car car = productionLine.work();
            System.out.println(car);
            carBuild++;
        }
        System.out.println("Всего изготовлено: " + carBuild);
    }
}
