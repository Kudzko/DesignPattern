package by.andersen.kudko.observer.modernmodel;

import java.util.Observable;

public class WeatherDataNew extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDataNew() {

    }


    public void measurementsChenged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurement(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    // Another methods

}
