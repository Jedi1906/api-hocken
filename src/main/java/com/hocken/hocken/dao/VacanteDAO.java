package com.hocken.hocken.dao;
import com.hocken.hocken.model.Vacante;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VacanteDAO{
    List<Vacante> getVacantes();
    void nuevaVacante(Vacante vacante);
    
}
