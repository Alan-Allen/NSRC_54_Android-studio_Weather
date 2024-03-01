package com.example.weather2_54;

public class WeatherData {

    private String weather;
    private String temp;

    public WeatherData(String weather, String temp) {
        this.weather = weather;
        this.temp = temp;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }
}
