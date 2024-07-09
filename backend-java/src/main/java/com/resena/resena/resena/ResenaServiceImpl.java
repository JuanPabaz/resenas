package com.resena.resena.resena;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ResenaServiceImpl implements IResenaService{

    @Autowired
    private ResenaRepository resenaRepository;

    @Override
    public Optional<List<Resena>> findAllResena() {
        return Optional.of(resenaRepository.findAll());
    }
}
