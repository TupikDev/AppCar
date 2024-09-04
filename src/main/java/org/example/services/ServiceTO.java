package org.example.services;

import org.example.entity.Car;

public class ServiceTO implements MachineService{
    private final int coof = 13;

    @Override
    public boolean isApplicable(RequestCalculateService request) {
        return request.getServiceTO() != null;
    }

    @Override
    public void apply(Car car) {
        System.out.println("------------------");
        int result = car.getMileage()*coof;
        System.out.println("Стоимость ТО = " + result);
    }
}
