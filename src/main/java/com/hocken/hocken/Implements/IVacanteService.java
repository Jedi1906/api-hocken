package com.hocken.hocken.Implements;

import com.hocken.hocken.model.Vacante;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;

public interface IVacanteService {

    List<Vacante> getVacanteByNombre_vac(String nombre);
    List<Vacante> getVacanteByModalidad(String modalidad);
    List<Vacante> getVacanteByRango_sul(String rango_sul);
    List<Vacante> getVacanteByUbicacion(String ubicacion);
    List<Vacante> getVacanteAllByArea(String area);
    Page<Vacante> findAll(Pageable pageable);
    List<Vacante> getVacantesbyNEmpresa(String nombre);
    List<Vacante> getSelectbyID();

}
