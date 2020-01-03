package com.example.carchallengere;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application
{
    public static ArrayList<Car> cars;

    @Override
    public void onCreate() {
        super.onCreate();

        cars = new ArrayList<Car>();
        cars.add(new Car("Volkswagen", "Polo", "Chuck Norris","07550369751"));
        cars.add(new Car("Mercedes", "E200", "Peter Pollock","07550369751"));
        cars.add(new Car("Nissan", "Almera", "Chris James","07550369751"));
        cars.add(new Car("Volkswagen", "E180", "John Rambo","07550369751"));
        cars.add(new Car("Mercedes", "Kombi", "Nelson Mandela","07550369751"));
        cars.add(new Car("Nissan", "Navara", "Paul Bunting","07550369751"));
    }
}
