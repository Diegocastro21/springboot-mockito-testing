package com.course.javatesting.services;

import com.course.javatesting.models.Weather;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    public Weather getWeather(){
        Weather weather = new Weather();
        weather.setMinTemp(10);
        weather.setMaxTemp(45);
        weather.setStatus("Cloudy");
        return weather;
    }
}
