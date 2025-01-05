package com.example.clipaises.Services;

import com.example.clipaises.Models.Country;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CountryService {

    private final RestTemplate restTemplate;

    public CountryService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Country getCountry(String name) {
        String url = "https://restcountries.com/v3.1/name/" + name + "?fields=capital,population";
        Country[] countries = restTemplate.getForObject(url, Country[].class);
        if (countries != null && countries.length > 0) {
            return countries[0];
        } else {
            throw new RuntimeException("Country not found");
        }
    }
}