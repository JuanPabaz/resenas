package com.resena.resena.restaurante;

import com.resena.resena.imagen.Imagen;
import com.resena.resena.resena.Resena;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RestauranteServiceImpl implements IRestauranteService{

    @Autowired
    private RestauranteRepository restauranteRepository;

    @Override
    public Optional<List<RestauranteDTO>> findAllRestaurante() {
        List<Restaurante> restauranteList = restauranteRepository.findAll();
        List<RestauranteDTO> restauranteDTOList = new ArrayList<>();
        for (Restaurante restaurante: restauranteList){

            restauranteDTOList.add(RestauranteDTO.builder()
                    .idRestaurante(restaurante.getIdRestaurante())
                    .nombreRestaurante(restaurante.getNombreRestaurante())
                    .direccion(restaurante.getDireccion())
                    .telefono(restaurante.getTelefono())
                    .idCategoria(restaurante.getCategoria().getIdCategoria())
                    .imagenList(restaurante.getImagenList()
                            .stream().map(Imagen::getIdImagen).collect(Collectors.toList()))
                    .resenaList(restaurante.getResenaList()
                            .stream().map(Resena::getIdResena).collect(Collectors.toList()))
                    .build());

        }
        return Optional.of(restauranteDTOList);
    }
}
