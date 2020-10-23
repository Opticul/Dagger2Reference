package com.opticulapps.daggertest2.dagger;

import com.opticulapps.daggertest2.car.ExternalLibraryWheels;
import com.opticulapps.daggertest2.car.Rims;
import com.opticulapps.daggertest2.car.Tires;

import dagger.Module;
import dagger.Provides;
// Created so that, even if you cannot add "inject" to rims, tires or wheels, you can still provide them
@Module
public abstract class WheelsModule {

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static ExternalLibraryWheels provideWheels(Rims rims, Tires tires) {
        return new ExternalLibraryWheels(rims,tires);
    }
}
