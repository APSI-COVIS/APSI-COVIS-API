package com.covis.api.world;

import com.covis.api.covid.CovidCasesType;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.format.annotation.DateTimeFormat;


import java.util.Date;


@RequestMapping(value = "/api/world")
public interface WorldCovidInformationResource {

    @RequestMapping(value = "/epidemy-info", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String listWorldEpidemyInfoAsGeoJson(@RequestParam("date") @DateTimeFormat(pattern="yyyy-MM-dd") Date date,
                                                     @RequestParam("type") CovidCasesType type);



}
