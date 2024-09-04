package org.example.services;

import org.example.entity.Car;

public class NewService implements MachineService{
    @Override
    public boolean isApplicable(RequestCalculateService request) {
        return false;
    }

    @Override
    public void apply(Car car) {

    }
}
