package com.covis.api;

import com.covis.api.dto.Dto;


public class CovidCaseDto implements Dto {

    private static final long serialVersionUID = 6596355344373136407L;

    private int cases;
    private String countrySlug;

    public CovidCaseDto(int cases, String countrySlug){
        this.cases = cases;
        this.countrySlug = countrySlug;
    }

    public int getCases() {
        return cases;
    }

    public void setCases(int cases) {
        this.cases = cases;
    }

    public String getCountrySlug() {
        return countrySlug;
    }

    public void setCountrySlug(String countrySlug) {
        this.countrySlug = countrySlug;
    }



}
