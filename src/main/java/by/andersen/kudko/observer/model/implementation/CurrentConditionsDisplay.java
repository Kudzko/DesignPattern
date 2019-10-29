package by.andersen.kudko.observer.model.implementation;

import by.andersen.kudko.observer.model.DisplayElement;
import by.andersen.kudko.observer.model.Observer;
import by.andersen.kudko.observer.model.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
