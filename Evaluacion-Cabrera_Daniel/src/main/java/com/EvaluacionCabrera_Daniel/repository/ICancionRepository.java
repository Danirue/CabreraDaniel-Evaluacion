package com.EvaluacionCabrera_Daniel.repository;

import com.EvaluacionCabrera_Daniel.entity.Cancion;
import com.EvaluacionCabrera_Daniel.entity.Lista_de_reproduccion;

import java.util.List;

public interface ICancionRepository {
    public List<Cancion> findAll();

}
