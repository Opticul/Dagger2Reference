package com.opticulapps.daggertest2;

import android.app.Application;

public class ExampleApp extends Application {
    private CarComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerCarComponent.builder()
                .horsePower(120)
                .engineCapacity(1400)
                .build();
    }
    // Unlike the simpleton annotation in the carcomponement class, this class is decleared as a wrapper in the android manifest and is always available and only created once.
    public CarComponent getAppComponent() {
        return component;
    }
}
