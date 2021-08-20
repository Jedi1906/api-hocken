package com.hocken.hocken.controller;

import com.hocken.hocken.Implements.VacanteIm;
import com.hocken.hocken.dao.IVacanteDAO;
import com.hocken.hocken.dao.VacanteDAO;
import com.hocken.hocken.model.Vacante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin (origins = "http://localhost:4200")
public class VacanteController {

    @Autowired
    private VacanteDAO vacanteDAO;
    @Autowired
    private VacanteIm vacanteIm;

    /**Metódo todas las vacantes*/
    @RequestMapping(value = "api/vacantes")
    public List<Vacante> getVacantes(){
        return vacanteDAO.getVacantes();
    }
    /**Listar vacantes con paginador*/
    @RequestMapping(value = "api/listar")
    public ResponseEntity<Page<Vacante>> listar(Pageable pageable) throws Exception{
    Page<Vacante> vacantes = vacanteIm.findAll(pageable);
    return new ResponseEntity<Page<Vacante>>(vacantes, HttpStatus.OK);
    }

    /**Filtros de vacantes por Nombre, Modalidad, rango y area*/
    @RequestMapping(value = "api/vacantepor/{nombre_vac}")
    public List<Vacante> getVacanteByNombre_Vac(@PathVariable String nombre_vac){return vacanteIm.getVacanteByNombre_vac(nombre_vac);}
    @RequestMapping(value = "api/vacante/por/{modalidad}")
    public List<Vacante> getVacanteByModalidad(@PathVariable String modalidad){return vacanteIm.getVacanteByModalidad(modalidad);}
    @RequestMapping(value = "api/vacante/by/{rango_sul}")
    public List<Vacante> getVacanteByRango_sul(@PathVariable String rango){return vacanteIm.getVacanteByRango_sul(rango);}
    /*Filtro para Select*/
    @RequestMapping(value ="api/selected")
    public List<Vacante> getNombrebiID(){return vacanteDAO.getNombre();}

    @RequestMapping(value = "api/vacantes/por/{ubicacion}")
    public List<Vacante> getVacanteByubicacion(@PathVariable String ubicacion){return vacanteIm.getVacanteByUbicacion(ubicacion);}
    @RequestMapping(value = "api/vacantes/by/{area}")
    public List<Vacante> getVacanteAllbyArea(@PathVariable String area){
        return vacanteIm.getVacanteAllByArea(area);
    }

    /**Demás metódos para vacantes CRUD*/
    @RequestMapping (value = "api/vacantes", method = RequestMethod.POST)
    public void nuevaVacante(@RequestBody Vacante vacante){
         vacanteDAO.nuevaVacante(vacante);
    }

}
