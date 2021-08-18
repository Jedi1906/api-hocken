package com.hocken.hocken.dao;
import com.hocken.hocken.model.Vacante;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VacanteDAO{
    List<Vacante> getVacantes();
    void eliminar(int id_vacante);
    //test
    Vacante getVacanteId(int id_vacante);
    List<Vacante> getVacantebynombre(String nombre_vac);
    void nuevaVacante(Vacante vacante);
    
}
