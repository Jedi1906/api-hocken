package com.hocken.hocken.dao;

import com.hocken.hocken.model.Candidato;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CandidatoDAO  {
    List<Candidato> getCandidatos();
    void eliminarCandidato(int id_candidato);

    void nuevoCandidato(Candidato candidato);

    boolean Verificausuario(Candidato candidato);
}
