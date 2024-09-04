package org.example.services;

import org.example.entity.Car;

public interface MachineService {
    boolean isApplicable(RequestCalculateService request);
    void apply(Car car);
}
