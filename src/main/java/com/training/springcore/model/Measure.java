package com.training.springcore.model;

import java.time.Instant;

public class Measure {

    private Instant instant;
    private Integer valueInWatt;
    private Captor captor;

    public Measure(Instant instant, Integer valueInWatt, Captor captor){
        this.instant = instant;
        this.valueInWatt = valueInWatt;
        this.captor = captor;
    }

    public Instant getInstant() {
        return instant;
    }

    public Integer getValueInWatt() {
        return valueInWatt;
    }
}
