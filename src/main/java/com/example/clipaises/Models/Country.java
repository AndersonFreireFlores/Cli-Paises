package com.example.clipaises.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public record Country(String name, String officialName, String capital, long population) {

    }
