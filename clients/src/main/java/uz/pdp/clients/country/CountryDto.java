package uz.pdp.clients.country;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CountryDto {
    private Integer id;
    private String name;
    private Integer continentId;
}

