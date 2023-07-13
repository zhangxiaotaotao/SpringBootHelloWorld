package com.zjt.monitor;

import com.zjt.monitor.event.RainEvent;
import com.zjt.monitor.event.SnowEvent;
import com.zjt.monitor.listener.RainListener;
import com.zjt.monitor.listener.SnowListener;
import com.zjt.monitor.multicast.WeatherEventMulticast;

public class TestEventMonitor {
    public static void main(String[] args) {
        WeatherEventMulticast weatherEventMulticast = new WeatherEventMulticast();
        RainListener rainListener = new RainListener();
        SnowListener snowListener = new SnowListener();
        weatherEventMulticast.addListener(rainListener);
        weatherEventMulticast.addListener(snowListener);

        weatherEventMulticast.multicastEvent(new SnowEvent());
        weatherEventMulticast.multicastEvent(new RainEvent());

        weatherEventMulticast.removeListener(rainListener);
        weatherEventMulticast.multicastEvent(new SnowEvent());
        weatherEventMulticast.multicastEvent(new RainEvent());
    }
}
