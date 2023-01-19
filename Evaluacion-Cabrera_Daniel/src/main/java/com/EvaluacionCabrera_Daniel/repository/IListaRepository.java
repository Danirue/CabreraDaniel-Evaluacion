package com.EvaluacionCabrera_Daniel.repository;

import com.EvaluacionCabrera_Daniel.dao.IListaDao;
import com.EvaluacionCabrera_Daniel.entity.Lista_de_reproduccion;

import java.util.List;

public interface IListaRepository  {
    public List<Lista_de_reproduccion> findAll();
}
