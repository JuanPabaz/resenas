package com.resena.resena.restaurante;

import java.util.List;
import java.util.Optional;

public interface IRestauranteService {

    Optional<List<Restaurante>> findAllRestaurante();

}
