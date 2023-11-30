package com.integradash.apiintegradash.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

public record AlertaDto(
        @NotBlank String nomealerta,
        @NotBlank String nivel_criticidade ,
        @NotBlank String data_alerta, //datetime alterar
        @NotBlank String status_alerta,
        @NotBlank String descricao_alerta

) {
}
