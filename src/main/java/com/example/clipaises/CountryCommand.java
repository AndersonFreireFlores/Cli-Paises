package com.example.clipaises;

import com.example.clipaises.Models.Country;
import com.example.clipaises.Services.CountryService;
import org.springframework.shell.command.annotation.Command;
import org.springframework.shell.command.annotation.Option;

@Command(group = "Country commands")
public class CountryCommand {

    private final CountryService countryService;

    public CountryCommand(CountryService countryService) {
        this.countryService = countryService;
    }

    @Command(command = "hello", description = "Prints a hello message")
    public String hello() {
        return "Hello, World!";
    }
    @Command(command = "pais", description = "Generates information about a country")
    public String pais(@Option(description = "Name of the country in lowercase and in English") String nome) {
        Country country = countryService.getCountry(nome);
        String capital = String.join(", ", country.capital());
        return "Country: " + nome + ", Capital: " + capital + ", Population: " + country.population();
    }
}
