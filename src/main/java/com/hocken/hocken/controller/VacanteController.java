package com.hocken.hocken.controller;

import com.hocken.hocken.dao.VacanteDAO;
import com.hocken.hocken.model.Vacante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin (origins = "http://localhost:4200")
public class VacanteController {
    @Autowired
    private VacanteDAO vacanteDAO;

    //Todas las vacantes
    @RequestMapping(value = "api/vacantes")
    public List<Vacante> getVacantes(){
       return vacanteDAO.getVacantes();
    }

    @RequestMapping(value = "api/vacantes/{nombre_vac}")
    public List<Vacante> getVacantesbynombre(@PathVariable String nombre_vac){
        return vacanteDAO.getVacantebynombre(nombre_vac);
    }
    /*Nueva vacante*/
    @RequestMapping(value = "api/vacantes", method = RequestMethod.POST)
    public void nuevaVacante(@RequestBody Vacante vacante){
         vacanteDAO.nuevaVacante(vacante);
    }
    /*Buscar vacante por identificador
    @RequestMapping(value = "api/vacantes/{id_vacante}")
    public Vacante listabyId(@PathVariable int id_vacante){
        return vacanteDAO.getVacanteId(id_vacante);
    }
    */
    /*Eliminar*/
    @RequestMapping(value = "api/vacantes/{id_vacante}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable int id_vacante){
    vacanteDAO.eliminar(id_vacante);
    }
}
