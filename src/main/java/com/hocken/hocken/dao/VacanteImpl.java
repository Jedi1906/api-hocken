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

    /*Nueva vacante*/
    @Override
    public void nuevaVacante(Vacante vacante) {
        entityManager.merge(vacante);
    }

    @Override
    public List<Vacante> getNombre() {

        return entityManager.createQuery("SELECT id_vacante,modalidad from Vacante group by(modalidad)").getResultList();
    }
}
