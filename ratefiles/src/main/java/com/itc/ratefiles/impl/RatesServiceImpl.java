package com.itc.ratefiles.impl;

import com.itc.ratefiles.entities.Ratesjordan;
import com.itc.ratefiles.repository.RatesRepository;
import com.itc.ratefiles.services.RatesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatesServiceImpl implements RatesServices {
    @Autowired
    private RatesRepository ratesRepository;

//    public RatesServiceImpl(RatesRepository ratesRepository) {
//        this.ratesRepository = ratesRepository;
//    }

    @Override
    public Ratesjordan add(Ratesjordan ratesjordan) {
        return ratesRepository.save(ratesjordan);
    }

    @Override
    public List<Ratesjordan> get() {
        return ratesRepository.findAll();
    }

    @Override
    public Ratesjordan get(Long id) {
        return ratesRepository.findById(id).orElseThrow(() -> new RuntimeException( "Rate not found"));
    }
}
