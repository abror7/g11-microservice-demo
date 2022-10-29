package uz.pdp.countryservice.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.clients.country.CountryDto;

import java.util.List;

@RestController
@RequestMapping("/api/countries")
public class CountryController {

    List<CountryDto> countryDtoList = List.of(
            new CountryDto(
                    1,
                    "Uzb",
                    1
            ),
            new CountryDto(
                    1,
                    "KZ",
                    1
            ),
            new CountryDto(
                    1,
                    "TJK",
                    1
            )
    );


    @GetMapping("/byContinentId/{continentId}")
    public List<CountryDto> davlatlarniOlishByContinentId(@PathVariable Integer continentId){
        //....
        //....
        //....
        //....
        //....
        System.out.println("Continent servicedan request keldi");
        return countryDtoList;

    }
}
