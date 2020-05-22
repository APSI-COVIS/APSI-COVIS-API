package com.covis.api.country;


import com.covis.api.country.dto.CountryPopulationDto;
import com.covis.api.country.dto.CovidDailyCasesDto;
import com.covis.api.covid.CovidCasesType;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.List;
import java.util.Date;

@RequestMapping(value = "/api/countries")
public interface CountryCovidInformationResource {

    @RequestMapping(value = "/{country-slug}/epidemy-info", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CovidDailyCasesDto> listEpidemyDataInCountry(@RequestParam("from") @DateTimeFormat(pattern="yyyy-MM-dd") Date from,
                                                      @RequestParam("to") @DateTimeFormat(pattern="yyyy-MM-dd") Date to,
                                                      @PathVariable("country-slug") String countrySlug,
                                                      @RequestParam("type") CovidCasesType type);

    @RequestMapping(value = "/{country-slug}/epidemy-forecast", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CovidDailyCasesDto> listEpidemyForecastInCountry(@RequestParam("from") @DateTimeFormat(pattern="yyyy-MM-dd") Date from,
                                                          @RequestParam("to") @DateTimeFormat(pattern="yyyy-MM-dd") Date to,
                                                          @PathVariable("country-slug") String countrySlug,
                                                          @RequestParam("type") CovidCasesType type);

    @RequestMapping(value = "/{country-slug}/population", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public CountryPopulationDto getCountryPopulation(@RequestParam("when") @DateTimeFormat(pattern="yyyy-MM-dd") Date dateWhen,
                                              @PathVariable("country-slug") String countrySlug);

}
