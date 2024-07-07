package com.resena.resena.restaurante;

import com.resena.resena.categoria.Categoria;
import com.resena.resena.imagen.Imagen;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @OneToMany(targetEntity = Imagen.class, fetch = FetchType.LAZY, mappedBy = "restaurante")
    private List<Imagen> imagenList;


}
