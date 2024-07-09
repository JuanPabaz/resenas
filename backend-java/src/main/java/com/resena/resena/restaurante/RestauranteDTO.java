package com.resena.resena.restaurante;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class RestauranteDTO {

    private Long idRestaurante;
    private String nombreRestaurante;
    private String direccion;
    private String telefono;
    private Long idCategoria;
    private List<Long> imagenList;
    private List<Long> resenaList;
}
