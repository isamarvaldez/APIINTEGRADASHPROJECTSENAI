package com.integradash.apiintegradash.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.util.UUID;

@Getter
@Entity
@Setter
@Table(name = "tb_planta")

public class PlantaModel {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    private String nomeplanta;
    private  String endereco_planta;

    //@OneToMany
   // @JoinColumn(name = "id_planta", referencedColumnName = "id")
   // private PlantaErroModel plantaErro;











}
