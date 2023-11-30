package com.integradash.apiintegradash.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;
public record PlantaDto (
    @NotBlank String nomeplanta,
    @NotBlank String endereco_planta
    )
{

}
