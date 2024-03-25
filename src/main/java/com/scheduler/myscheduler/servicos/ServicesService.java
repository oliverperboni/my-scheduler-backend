package com.scheduler.myscheduler.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class ServicesService {

    private final ServiceRepository serviceRepository;

    @Autowired
    public ServicesService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    public List<Servicos> getServices() {
        return serviceRepository.findAll();
    }

    public void addNewService(Servicos service) {
        serviceRepository.save(service);
        
    }

    public void deleteService(int id) {
       serviceRepository.deleteById(id);
    }


    @Transactional
    public void updateServcice(int id, String name) {
        Servicos service = serviceRepository.findById(id).orElseThrow(() -> new IllegalStateException());
        service.setName(name);
    }

}
