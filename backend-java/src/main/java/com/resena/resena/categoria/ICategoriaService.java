package com.resena.resena.categoria;

import java.util.List;
import java.util.Optional;

public interface ICategoriaService {

    Optional<List<Categoria>> findAllCategorias();

}
