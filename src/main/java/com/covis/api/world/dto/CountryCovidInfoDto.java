package com.covis.api.world.dto;

import com.covis.api.dto.Dto;
import com.covis.api.geolocation.Point;

public class CountryCovidInfoDto implements Dto{

    private static final long serialVersionUID = 362952251532711591L;

    private String countrySlug;
    private int activeCases;
    private Point point;

    public CountryCovidInfoDto(String countrySlug, int activeCases, Point point) {
        this.countrySlug = countrySlug;
        this.activeCases = activeCases;
        this.point = point;
    }


    public String getCountrySlug() {
        return countrySlug;
    }

    public void setCountrySlug(String countrySlug) {
        this.countrySlug = countrySlug;
    }

    public int getActiveCases() {
        return activeCases;
    }

    public void setActiveCases(int activeCases) {
        this.activeCases = activeCases;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }





}
