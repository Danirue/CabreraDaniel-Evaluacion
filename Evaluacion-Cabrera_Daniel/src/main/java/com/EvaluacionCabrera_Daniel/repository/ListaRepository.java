package com.EvaluacionCabrera_Daniel.repository;

import com.EvaluacionCabrera_Daniel.dao.ICancionDao;
import com.EvaluacionCabrera_Daniel.dao.IListaDao;
import com.EvaluacionCabrera_Daniel.entity.Lista_de_reproduccion;

import java.util.Optional;

public class ListaRepository implements IListaDao {


    @Override
    public <S extends Lista_de_reproduccion> S save(S entity) {
        return (S) IListaDao.findAll();
    }

    @Override
    public <S extends Lista_de_reproduccion> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Lista_de_reproduccion> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Lista_de_reproduccion> findAll() {
        return null;
    }

    @Override
    public Iterable<Lista_de_reproduccion> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Lista_de_reproduccion entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Lista_de_reproduccion> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
