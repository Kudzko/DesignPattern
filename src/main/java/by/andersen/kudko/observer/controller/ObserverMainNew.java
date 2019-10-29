package by.andersen.kudko.observer.controller;


import by.andersen.kudko.observer.modernmodel.CurrentConditionsDisplayNew;
import by.andersen.kudko.observer.modernmodel.ForecastDisplay;
import by.andersen.kudko.observer.modernmodel.WeatherDataNew;

public class ObserverMainNew {
    public static void main(String[] args) {

        WeatherDataNew weatherData = new WeatherDataNew();

        CurrentConditionsDisplayNew currentConditionsDisplay =
                new CurrentConditionsDisplayNew(weatherData);

        ForecastDisplay forecastDisplay =
                new ForecastDisplay(weatherData);


        weatherData.setMeasurement(80, 65, 30.4f);
        weatherData.measurementsChenged();
        weatherData.setMeasurement(82, 70, 29.2f);
        weatherData.measurementsChenged();
        weatherData.setMeasurement(78, 90, 40.1f);
        weatherData.measurementsChenged();


    }
}
