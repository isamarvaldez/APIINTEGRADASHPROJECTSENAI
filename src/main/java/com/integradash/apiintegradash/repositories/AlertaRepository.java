package com.integradash.apiintegradash.repositories;

import com.integradash.apiintegradash.models.AlertaModel;
import com.integradash.apiintegradash.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AlertaRepository extends JpaRepository<AlertaModel, UUID> {
    UsuarioModel findBynomealerta(String nomealerta);
}