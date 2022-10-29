package uz.pdp.continentservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import uz.pdp.clients.country.CountryClient;
import uz.pdp.clients.country.CountryDto;

import java.util.List;

@RestController
@RequestMapping("/api/continents")
@RequiredArgsConstructor
public class ContinentController {

    private final RestTemplate restTemplate;
    private final CountryClient countryClient;

    private List<String> continents = List.of("Asia", "Europe");

    @GetMapping
    public HttpEntity<?> getAllContinents() {
        return ResponseEntity.ok(continents);
    }

    @GetMapping("/{continentId}/countries")
    public HttpEntity<?> getCountriesByContinentId(@PathVariable Integer continentId) {

        List<CountryDto> davlatlar = countryClient.davlatlarniOlishByContinentId(continentId);

//        CountryDto[] davlatlar = restTemplate.getForObject("http://country/api/countries/byContinentId/{continentId}",
//                CountryDto[].class, continentId);

        return ResponseEntity.ok(davlatlar);

    }
}
