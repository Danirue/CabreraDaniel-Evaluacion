package com.EvaluacionCabrera_Daniel.dao;

import com.EvaluacionCabrera_Daniel.entity.Lista_de_reproduccion;
import org.springframework.data.repository.CrudRepository;

public interface IListaDao extends CrudRepository<Lista_de_reproduccion, Long> {
}
