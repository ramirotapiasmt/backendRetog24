package com.ciclo3retog24.retog24.servicio;

import com.ciclo3retog24.retog24.entidad.Gama;
import com.ciclo3retog24.retog24.repositorio.GamaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamaService {
    @Autowired
    GamaRepository repository;

    public List<Gama> getGamas(){
        return repository.findAll(); }

    public Gama saveGama(Gama gama) {
        return repository.save(gama); }

    public Gama getGama(long id) {
        return repository.findById(id).orElse(null); }

    public Gama updateGama(Gama gamaUpd) {
        Gama gamaOld = getGama(gamaUpd.getIdGama());
        gamaOld.setName(gamaUpd.getName());
        gamaOld.setDescription(gamaUpd.getDescription());
        gamaOld.setCar(gamaUpd.getCar());
        return repository.save(gamaOld);

    }

    public void deleteGama(long id) {
        repository.deleteById(id);
    }



}
