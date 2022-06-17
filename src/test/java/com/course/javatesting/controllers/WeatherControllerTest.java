package com.course.javatesting.controllers;

import com.course.javatesting.models.Weather;
import com.course.javatesting.services.WeatherService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class WeatherControllerTest {

    @InjectMocks
    private WeatherController controller;

    @Mock
    private WeatherService service;

    @Test
    public void getWeather(){
        Weather weatherMock = new Weather();
        weatherMock.setMaxTemp(10);
        weatherMock.setMinTemp(5);
        weatherMock.setStatus("Despejado");
        when(service.getWeather()).thenReturn(weatherMock);

        Weather result = controller.getWeather();

        verify(service, times(1)).getWeather();
    }
}
