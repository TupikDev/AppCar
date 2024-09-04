package org.example.services;

public class RequestCalculateService {
    private ServiceTO serviceTO;

    public RequestCalculateService(ServiceTO serviceTO) {
        this.serviceTO = serviceTO;
    }

    public ServiceTO getServiceTO() {
        return serviceTO;
    }

}
