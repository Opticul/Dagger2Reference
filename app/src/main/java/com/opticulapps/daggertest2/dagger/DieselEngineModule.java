package com.opticulapps.daggertest2.dagger;

import com.opticulapps.daggertest2.car.DieselEngine;
import com.opticulapps.daggertest2.car.EngineInterface;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

@Provides
int provideHorsePower(){
        return horsePower;
};

    //Cannot use "bind" if you need runtime variables set
@Provides
    EngineInterface provideEngine(DieselEngine engine){
    return engine;
};
}

