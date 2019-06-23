package learning.dps.behavioral.hfds.demo;

public class CurrentConditionsDisplay implements Observer {

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

    public void display() {
        System.out.println("current conditions: " + temperature + "F Degrees humidity: " + humidity);
    }
}
