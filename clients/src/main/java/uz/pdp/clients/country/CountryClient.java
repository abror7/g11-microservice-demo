package uz.pdp.clients.country;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("country")
public interface CountryClient {

    @GetMapping("/api/countries/byContinentId/{continentId}")
    List<CountryDto> davlatlarniOlishByContinentId(@PathVariable(name = "continentId") Integer continentId);


}
