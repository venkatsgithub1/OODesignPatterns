package learning.dps.hfdps.observer;

import learning.dps.hfdps.observer.display.CurrentConditionsDisplay;
import learning.dps.hfdps.observer.subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(50, 65, 30.45f);
    }
}
