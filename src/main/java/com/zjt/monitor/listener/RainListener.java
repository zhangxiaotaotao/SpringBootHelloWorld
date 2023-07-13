package com.zjt.monitor.listener;

import com.zjt.monitor.event.RainEvent;
import com.zjt.monitor.event.WeatherEvent;

public class RainListener implements WeatherListener {
    @Override
    public void onWeatherEvent(WeatherEvent weatherEvent) {
        if (weatherEvent instanceof RainEvent) {
            System.out.println("hello -> " + weatherEvent.getWeather());
        }
    }
}
