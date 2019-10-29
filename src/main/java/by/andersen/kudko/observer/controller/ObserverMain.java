package by.andersen.kudko.observer.controller;

import by.andersen.kudko.observer.model.implementation.CurrentConditionsDisplay;
import by.andersen.kudko.observer.model.implementation.WeatherData;

public class ObserverMain {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurement(80, 65, 30.4f);
        weatherData.notifyObservers();
        weatherData.setMeasurement(82, 70, 29.2f);
        weatherData.notifyObservers();
        weatherData.setMeasurement(78, 90, 40.1f);
        weatherData.notifyObservers();


    }
}
