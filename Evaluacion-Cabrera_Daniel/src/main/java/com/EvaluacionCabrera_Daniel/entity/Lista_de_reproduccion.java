package com.EvaluacionCabrera_Daniel.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="listas de reproduccion")
@Getter
@Setter
public class Lista_de_reproduccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @jakarta.persistence.Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="Id_Lista")
    private Long id_lista;

    @Column(name="Nombre")
    private String nombre;

    @Column(name="Descripcion")
    private String descripcion;

    @Column(name="Canciones")
    private String canciones;

    @JsonIgnore
    @OneToMany(mappedBy = "Lista_de_reproduccion")
    private List<Cancion>cancions;


}
