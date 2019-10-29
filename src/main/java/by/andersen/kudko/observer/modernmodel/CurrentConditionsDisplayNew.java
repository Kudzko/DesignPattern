package by.andersen.kudko.observer.modernmodel;

import by.andersen.kudko.observer.model.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplayNew implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;


    public CurrentConditionsDisplayNew(Observable weatherData) {
        this.observable = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + temperature
                + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherDataNew) {
            WeatherDataNew weatherData = (WeatherDataNew) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
