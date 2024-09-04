package org.example.handler;

import org.example.entity.User;
import org.example.services.MachineService;
import org.example.services.RequestCalculateService;

import java.util.List;

public class MashineHandler {
    List<MachineService> services;

    public void calculateServicesCost(User user, RequestCalculateService request){
        for(MachineService service: services){
            if(service.isApplicable(request)){
                user.getCars().forEach(service::apply);
            }
        }
    }
}
