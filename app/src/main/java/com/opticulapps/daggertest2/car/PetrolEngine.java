package com.opticulapps.daggertest2.car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements EngineInterface {
    private int horsePower;
    private int engineCapacity;

    private static final String TAG = "PetrolEngine";

    @Inject
    public PetrolEngine(@Named("horsePower") int horsePower,@Named("engineCapacity") int engineCapacity){
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void startEngine(){
        Log.d(TAG,"WROOOOM but with petrol and " + horsePower + " hk and " + engineCapacity + " capacity!");
    }
}
