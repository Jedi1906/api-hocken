package com.hocken.hocken.dao;
import com.hocken.hocken.model.Vacante;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class VacanteImpl implements VacanteDAO{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Vacante> getVacantes() {
        /*Consulta a base de datos a través de objetos JAVA agregar los demás metodos en DAO */
        String query= "FROM Vacante";
        return entityManager.createQuery(query).getResultList();
    }
    /*TEST FILTRO*/
    @Override
    public List<Vacante> getVacantebynombre(String nombre_vac) {
            String query = "FROM vacante where nombre_vac=':nombre_vac'";
        return entityManager.createQuery(query).getResultList();
    }
    /*eliminar vacantes*/
    @Override
    public void eliminar(int id_vacante) {
        Vacante vacante = entityManager.find(Vacante.class,id_vacante);
        entityManager.remove(vacante);
    }
        /*Testear si funciona*/
    @Override
    public Vacante getVacanteId(int id_vacante) {
        String query = "FROM Vacante where id_vacante =:id_vacante";
     return (Vacante) entityManager.createQuery(query).getSingleResult();
    }




    /*Nueva vacante*/
    @Override
    public void nuevaVacante(Vacante vacante) {
        entityManager.merge(vacante);
    }
}
