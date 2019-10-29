package by.andersen.kudko.observer.modernmodel;

import by.andersen.kudko.observer.model.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;


    public ForecastDisplay(Observable observable) {

        observable.addObserver(this);
    }


    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherDataNew) {
            WeatherDataNew weatherDataNew = (WeatherDataNew) o;
            lastPressure = currentPressure;
            currentPressure = weatherDataNew.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Forecast display");
    }
}
