package com.opticulapps.daggertest2.car;

//Cannot annotate with @inject since it is external

import javax.inject.Inject;

public class ExternalLibraryWheels {

    private Rims rims;
    private Tires tires;

    @Inject
    public ExternalLibraryWheels(Rims rims, Tires tires){
        this.rims = rims;
        this.tires = tires;
    }
}
