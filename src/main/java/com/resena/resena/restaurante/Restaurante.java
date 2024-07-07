package com.resena.resena.restaurante;

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
public class Restaurante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_restaurante")
    private Long idRestaurante;

    @Column(name = "nombre_restaurante")
    private String nombreRestaurante;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "telefono")
    private String telefono;


}
