package com.opticulapps.daggertest2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.opticulapps.daggertest2.car.Car;
import com.opticulapps.daggertest2.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car1,car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Use create if you don't need any variables passed to constructors
       // CarComponent component = DaggerCarComponent.create();

        CarComponent component = ((ExampleApp) getApplication()).getAppComponent();

        component.inject(this);

        car1.drive();
        car2.drive();
    }
}