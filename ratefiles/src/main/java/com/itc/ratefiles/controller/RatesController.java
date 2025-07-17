package com.itc.ratefiles.controller;

import com.itc.ratefiles.entities.Ratesjordan;
import com.itc.ratefiles.services.RatesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rates")
@CrossOrigin(origins = "http://localhost:3000")  // ✅ Allow React to access this controller
public class RatesController {

    @Autowired
    private RatesServices ratesServices;

    // Create
    @PostMapping
    public Ratesjordan create(@RequestBody Ratesjordan ratesjordan) {
        return ratesServices.add(ratesjordan);
    }

    // Get all
    @GetMapping
    public List<Ratesjordan> get() {
        return ratesServices.get();
    }

    // Get by ID
    @GetMapping("/{id}")
    public Ratesjordan getOne(@PathVariable Long id) {
        return ratesServices.get(id);
    }
}
