package com.opticulapps.daggertest2.car;

import android.util.Log;

import javax.inject.Inject;

// Can injects constructors, fields and methods, and they are instansiated in that order. 
public class Car {
    private static final String TAG = "Car";
    //private Engine engine;
    //private ExternalLibraryWheels wheels;
    private  ExternalLibraryWheels wheels;
    private EngineInterface engine;
    private Driver driver;
//     For instanciating with access to wheels injection

    @Inject
    public Car(Driver driver, EngineInterface engine, ExternalLibraryWheels wheels){
        this.engine = engine;
        this.wheels = wheels;
        this.driver = driver;
    }

    /* For instanciating with external wheels production
    @Inject
    public Car (Engine engine, ExternalLibraryWheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
        }
*/




       @Inject
       public void enableRemote(Remote remote){
        remote.setListener(this);
       }

        public void drive(){
           engine.startEngine();
            Log.d(TAG,driver + " is driving "+ this + " ! Wroom!");
    }
}
