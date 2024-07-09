package com.resena.resena.categoria;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CategoriaServiceImpl implements ICategoriaService{

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public Optional<List<Categoria>> findAllCategorias() {
        return Optional.of(categoriaRepository.findAll());
    }
}
