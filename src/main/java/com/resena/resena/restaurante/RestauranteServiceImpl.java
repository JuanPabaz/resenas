package com.resena.resena.restaurante;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestauranteServiceImpl implements IRestauranteService{

    @Autowired
    private RestauranteRepository restauranteRepository;

    @Override
    public Optional<List<Restaurante>> findAllRestaurante() {
        return Optional.of(restauranteRepository.findAll());
    }
}
