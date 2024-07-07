package com.resena.resena.resena;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Resena {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_resena")
    private Long idResena;

    @Column(name = "lugar")
    private Double lugar;

    @Column(name = "comida")
    private Double comida;

    @Column(name = "servicio")
    private Double servicio;

    @Column(name = "bebidas")
    private Double bebidas;

    @Column(name = "musica")
    private Double musica;

    @Column(name = "menu")
    private Double menu;

    @Column(name = "tiempo_espera")
    private Double tiempoEspera;

    @Column(name = "comentario")
    private String comentario;

}
