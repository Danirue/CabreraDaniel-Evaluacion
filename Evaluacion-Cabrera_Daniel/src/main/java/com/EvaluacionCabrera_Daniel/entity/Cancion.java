package com.EvaluacionCabrera_Daniel.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Entity
@Table(name="canciones")
@Getter
@Setter
public class Cancion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @jakarta.persistence.Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id_cancion;


    private String titulo;
    private String nombre_artista;
    private String album;
    private Integer anio;
    private String Lista_Reproducion;

    @ManyToOne
    @JoinColumn(name = "id_list", referencedColumnName = "Id_Lista")
    private Lista_de_reproduccion listas;


}
