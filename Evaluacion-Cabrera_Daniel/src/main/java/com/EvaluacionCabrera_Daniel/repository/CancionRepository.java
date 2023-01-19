package com.EvaluacionCabrera_Daniel.repository;

import com.EvaluacionCabrera_Daniel.dao.ICancionDao;
import com.EvaluacionCabrera_Daniel.entity.Cancion;

import java.util.Optional;

public class CancionRepository implements ICancionDao {



    @Override
     private ICancionDao cancionDao; {
        return (S) cancionDao.findAll();
    }

    @Override
    public <S extends Cancion> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Cancion> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Cancion> findAll() {
        return null;
    }

    @Override
    public Iterable<Cancion> findAllById(Iterable<Long> longs) {
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
    public void delete(Cancion entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Cancion> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
