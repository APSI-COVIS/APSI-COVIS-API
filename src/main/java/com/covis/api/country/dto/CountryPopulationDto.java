package com.covis.api.country.dto;

import com.covis.api.dto.Dto;

public class CountryPopulationDto implements Dto {

    private static final long serialVersionUID = -5485955453330939210L;

    String countrySlug;
    int population;


    public CountryPopulationDto(String countrySlug, int population) {
        this.countrySlug = countrySlug;
        this.population = population;
    }

    public String getCountrySlug() {
        return countrySlug;
    }

    public void setCountrySlug(String countrySlug) {
        this.countrySlug = countrySlug;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
