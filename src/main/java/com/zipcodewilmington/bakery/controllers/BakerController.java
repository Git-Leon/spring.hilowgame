package com.zipcodewilmington.bakery.controllers;

import com.zipcodewilmington.bakery.models.Baker;
import com.zipcodewilmington.bakery.services.BakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;


@Controller
//@CrossOrigin(IPAddress)

public class BakerController {

    private BakerService service;//service is always Singleton,is a bean.

    @Autowired// Telling IOC to inject Beans.Dependency Injection//it updated in moc database.
    public BakerController(BakerService service) {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/bakers/")
    public ResponseEntity<Iterable<Baker>> index() {
        return new ResponseEntity<>(service.index(), HttpStatus.OK);
    }

    @GetMapping("/bakers/{id}")
    public ResponseEntity<Baker> show(@PathVariable Long id) {
        return new ResponseEntity<>(service.show(id), HttpStatus.OK);
    }

    @PostMapping("/bakers/")
    public ResponseEntity<Baker> create(@RequestBody Baker baker) {
        return new ResponseEntity<>(service.create(baker), HttpStatus.CREATED);
    }

    @PutMapping("/bakers/{id}")
    public ResponseEntity<Baker> update(@PathVariable Long id, @RequestBody Baker baker) {
        return new ResponseEntity<>(service.update(id, baker), HttpStatus.OK);
    }

    @DeleteMapping("/bakers/{id}")
    public ResponseEntity<Boolean> destroy(@PathVariable Long id) {
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }
}
