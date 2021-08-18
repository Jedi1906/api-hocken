package com.hocken.hocken.controller;

import com.hocken.hocken.dao.CandidatoDAO;
import com.hocken.hocken.model.Candidato;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CandidatoController {

    @Autowired
    private CandidatoDAO candidatoDAO;
        @RequestMapping(value = "api/candidatos")
        public List<Candidato> getCandidatos(){
            return candidatoDAO.getCandidatos();
        }

    @RequestMapping(value = "api/candidatos", method = RequestMethod.POST)
    public void registro(@RequestBody Candidato candidato){
            /*Cifrado de contraseña Hash*/
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        String hash = argon2.hash(1,1024,1,candidato.getContrasena());
           candidato.setContrasena(hash);
       candidatoDAO.nuevoCandidato(candidato);
    }
        @RequestMapping(value = "api/candidatos/{id_candidato}")
        public void eliminar (@PathVariable int id_candidato){
            candidatoDAO.eliminarCandidato(id_candidato);
        }

}
