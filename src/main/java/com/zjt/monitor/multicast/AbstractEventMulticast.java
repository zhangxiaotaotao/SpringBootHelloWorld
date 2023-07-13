package com.zjt.monitor.multicast;

import com.zjt.monitor.event.WeatherEvent;
import com.zjt.monitor.listener.WeatherListener;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractEventMulticast implements EventMulticast{
    private List<WeatherListener> weatherListeners = new ArrayList<>();

    @Override
    public void multicastEvent(WeatherEvent event) {
        doStart();
        weatherListeners.forEach(weatherListener -> weatherListener.onWeatherEvent(event));
        doEnd();
    }

    @Override
    public void addListener(WeatherListener weatherListener) {
        weatherListeners.add(weatherListener);
    }

    @Override
    public void removeListener(WeatherListener weatherListener) {
        weatherListeners.remove(weatherListener);
    }

    abstract void doStart();
    abstract void doEnd();
}
