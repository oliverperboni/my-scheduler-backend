package com.scheduler.myscheduler.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/service")
public class ServicesConrtoller {

    private final ServicesService servicesService ;

    @Autowired
    public ServicesConrtoller(ServicesService servicesService) {
        this.servicesService = servicesService;
    }


    @GetMapping
    public List<Servicos> getServices(){
        return servicesService.getServices();
    }
    
    @PostMapping
    public void addService(@RequestBody Servicos service){
        servicesService.addNewService(service);

    }

    @DeleteMapping(path = "{id}")
    public void deleteService( @PathVariable("id") int id){
        servicesService.deleteService(id);

    }

    @PutMapping(path = "{id}")
    public void updateServcice(@PathVariable("id") int id,@RequestParam String name){
        servicesService.updateServcice(id,name);

    }



}
