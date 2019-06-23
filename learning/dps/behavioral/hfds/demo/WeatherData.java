package learning.dps.behavioral.hfds.demo;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    // List to maintain observers
    private List<Observer> observersList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observersList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observersList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observersList.indexOf(observer);
        if (index >= 0) {
            observersList.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observersList) {
            observer.update(temperature, humidity, pressure);
        }
    }

    private void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
