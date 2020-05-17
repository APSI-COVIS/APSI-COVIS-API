package com.covis.api.geolocation;

import java.io.Serializable;

public class Point implements Serializable{

    private double meridian;
    private double parallel;

    public Point(double meridian, double parallel) {
        this.meridian = meridian;
        this.parallel = parallel;
    }

    public double getMeridian() {
        return meridian;
    }

    public void setMeridian(double meridian) {
        this.meridian = meridian;
    }

    public double getParallel() {
        return parallel;
    }

    public void setParallel(double parallel) {
        this.parallel = parallel;
    }



}
