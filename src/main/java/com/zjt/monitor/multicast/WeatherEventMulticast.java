package com.zjt.monitor.multicast;

import com.zjt.monitor.multicast.AbstractEventMulticast;

public class WeatherEventMulticast extends AbstractEventMulticast {
    @Override
    void doStart() {
        System.out.println("begin broadcast weather event");
    }

    @Override
    void doEnd() {
        System.out.println("end broadcast weather event");
    }
}
