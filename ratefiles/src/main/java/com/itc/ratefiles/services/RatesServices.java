package com.itc.ratefiles.services;

import com.itc.ratefiles.entities.Ratesjordan;

import java.util.List;

public interface RatesServices {

    Ratesjordan add (Ratesjordan ratesjordan);

    List<Ratesjordan> get();

    Ratesjordan get (Long id);

}
