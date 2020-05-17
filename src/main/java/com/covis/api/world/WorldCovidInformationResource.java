package com.covis.api.world;

import com.covis.api.covid.CovidCasesType;
import com.covis.api.dto.Dto;
import com.covis.api.world.dto.CountryCovidInfoDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;


@RequestMapping(value = "/api/world")
public interface WorldCovidInformationResource {

    @RequestMapping(value = "/epidemy-info", method = RequestMethod.GET)
    public List<CountryCovidInfoDto> listWorldEpidemyInfo(@RequestParam("date") @DateTimeFormat(pattern="yyyy-MM-dd") Date date,
                                                     @RequestParam("type") CovidCasesType type);



}
