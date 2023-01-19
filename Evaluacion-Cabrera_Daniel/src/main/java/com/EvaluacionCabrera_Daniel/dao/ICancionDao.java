package com.EvaluacionCabrera_Daniel.dao;

import com.EvaluacionCabrera_Daniel.entity.Cancion;
import org.springframework.data.repository.CrudRepository;

public interface ICancionDao extends CrudRepository<Cancion, Long> {
}
