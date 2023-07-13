package com.zjt.monitor.listener;

import com.zjt.monitor.event.WeatherEvent;

public interface WeatherListener {
    void onWeatherEvent(WeatherEvent weatherEvent);
}
