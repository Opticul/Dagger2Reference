package com.opticulapps.daggertest2.car;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements EngineInterface {

    private static final String TAG = "Car";

    private int horsePower;

     @Inject
    public DieselEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    //@Inject
    //public DieselEngine(){}

    @Override
    public void startEngine(){
        Log.d(TAG,"WROOOOM with diesel! Horsepower: " + horsePower);
    }
}
