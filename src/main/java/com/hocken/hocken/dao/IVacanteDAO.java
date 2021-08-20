package com.hocken.hocken.dao;

import com.hocken.hocken.model.Empresa;
import com.hocken.hocken.model.Vacante;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IVacanteDAO extends CrudRepository<Vacante,Integer> {
    /*Filtro por nombre*/
    @Query("select v from Vacante v where v.nombre_vac= ?1")
    List<Vacante> getVacanteByNombre_vac(String nombre_vac);
    /*Filtro por modalidad*/
    @Query("select v from Vacante v where v.modalidad = ?1")
    List<Vacante> getVacanteByModalidad(String modalidad);
    /*Filtro por Rango*/
    @Query("select v from Vacante v where v.rango_sul = ?1")
    List<Vacante> getVacanteByRango_sul(String rango_sul);
    /*Filtro por ubicación*/
    @Query("select v from Vacante v where v.ubicacion = ?1")
    List<Vacante> getVacanteByUbicacion(String ubicacion);
    @Query("select v from Vacante v where v.area = ?1")
    List<Vacante> getAllByArea(String area);
    Page<Vacante> findAll(Pageable pageable);

    @Query(value = "select v from Vacante v join Empresa e on v.id_empresa = e.id_empresa where v.nombre_vac= ?1")
    List<Vacante> getVacantesbyNEmpresa(String nombre);
}
