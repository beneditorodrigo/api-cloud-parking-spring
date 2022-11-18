package com.beneditorodrigo.parking.controller;

import com.beneditorodrigo.parking.model.Parking;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/parking")
public class ParkingController {

    @GetMapping
    public List<Parking> findAll(){
        var parking = new Parking();
        parking.setLicense("QRS-12V5");
        parking.setState("PI");
        parking.setModel("HILUX SRV");
        parking.setColor("Branca");
        return Arrays.asList(parking, parking);
    }
}
