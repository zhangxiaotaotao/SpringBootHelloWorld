package com.zjt.monitor.multicast;

import com.zjt.monitor.event.WeatherEvent;
import com.zjt.monitor.listener.WeatherListener;

public interface EventMulticast {
    void multicastEvent(WeatherEvent event);

    void addListener(WeatherListener weatherListener);

    void removeListener(WeatherListener weatherListener);
}
