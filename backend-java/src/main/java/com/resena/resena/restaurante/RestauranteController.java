package com.resena.resena.restaurante;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RequestMapping("api/v2/restaurante")
@RestController
public class RestauranteController {

    @Autowired
    private RestauranteServiceImpl restauranteService;

    @GetMapping("/find_all_restaurante")
    public Optional<List<RestauranteDTO>> findAllRestaurante(){
        return restauranteService.findAllRestaurante();
    }

}
