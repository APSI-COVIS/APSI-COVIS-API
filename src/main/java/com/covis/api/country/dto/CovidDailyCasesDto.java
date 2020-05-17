package com.covis.api.country.dto;

import com.covis.api.dto.Dto;

import java.util.Date;

public class CovidDailyCasesDto implements Dto{

    private static final long serialVersionUID = -8122747357766951005L;

    private Date date;
    private int cases;


    public CovidDailyCasesDto(Date date, int cases) {
        this.date = date;
        this.cases = cases;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCases() {
        return cases;
    }

    public void setCases(int cases) {
        this.cases = cases;
    }
}
