package com.resena.resena.imagen;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagenRepository extends JpaRepository<Imagen, Long> {


}
