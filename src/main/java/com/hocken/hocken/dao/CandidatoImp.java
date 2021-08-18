package com.hocken.hocken.dao;

import com.hocken.hocken.model.Candidato;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
@Transactional
public class CandidatoImp implements CandidatoDAO{
    @PersistenceContext
    private EntityManager entityManager ;

    @Override
    @Transactional
    public List<Candidato> getCandidatos() {
        String query = "FROM Candidato";
        return entityManager.createQuery(query).getResultList();
    }


    @Override
    public void eliminarCandidato(int id_candidato) {
       Candidato candidato = entityManager.find(Candidato.class,id_candidato);
       entityManager.remove(candidato);
    }

    @Override
    public void nuevoCandidato(Candidato candidato) {
        entityManager.merge(candidato);
    }

    /*Verificar usuario el set parameter recupera el valor de Html*/
    @Override
    public boolean Verificausuario(Candidato candidato) {
        String query ="FROM Candidato where correo =:correo";
       List<Candidato> lista = entityManager.createQuery(query)
                       .setParameter("correo",candidato.getCorreo())
               .getResultList();
       if(lista.isEmpty()){
           return false;
       }
       String contrasHashed = lista.get(0).getContrasena();
       Argon2 argon2 =Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
       /*Realiza comparación entre contraseña cifrada y existente en base*/
        /*Continuar con cifrado mañana*/
        return  argon2.verify(contrasHashed,candidato.getContrasena());
    }
}
