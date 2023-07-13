package com.zjt.monitor.listener;

import com.zjt.monitor.event.SnowEvent;
import com.zjt.monitor.event.WeatherEvent;

public class SnowListener implements WeatherListener {
    @Override
    public void onWeatherEvent(WeatherEvent weatherEvent) {
        if (weatherEvent instanceof SnowEvent) {
            System.out.println("hello -> " + weatherEvent.getWeather());
        }
    }
}
