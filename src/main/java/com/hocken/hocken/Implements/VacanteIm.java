package com.hocken.hocken.Implements;

import com.hocken.hocken.dao.IVacanteDAO;
import com.hocken.hocken.dao.VacanteDAO;
import com.hocken.hocken.model.Vacante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VacanteIm  implements IVacanteService{
    @Autowired
    IVacanteDAO IvacanteDAO;
    @Override
    public List<Vacante> getVacanteByNombre_vac(String nombre) {
        return IvacanteDAO.getVacanteByNombre_vac(nombre);
    }
    @Override
    public List<Vacante> getVacanteByModalidad(String modalidad) {return IvacanteDAO.getVacanteByModalidad(modalidad);}
    @Override
    public List<Vacante> getVacanteByRango_sul(String rango_sul) {return IvacanteDAO.getVacanteByRango_sul(rango_sul);}
    @Override
    public List<Vacante> getVacanteByUbicacion(String ubicacion) {return IvacanteDAO.getVacanteByUbicacion(ubicacion);}
    @Override
    public List<Vacante> getVacanteAllByArea(String area) {
        return IvacanteDAO.getAllByArea(area);
    }
    /*Vacante relacionada */
    @Override
    public List<Vacante> getVacantesbyNEmpresa(String nombre) {return IvacanteDAO.getVacantesbyNEmpresa(nombre);}
    @Override
    public Page<Vacante> findAll(Pageable pageable) {
        return IvacanteDAO.findAll(pageable);
    }
}
