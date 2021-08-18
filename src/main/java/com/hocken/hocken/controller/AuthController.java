package com.hocken.hocken.controller;

import com.hocken.hocken.dao.CandidatoDAO;
import com.hocken.hocken.model.Candidato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    private CandidatoDAO candidatoDAO;
    @RequestMapping(value = "api/login", method = RequestMethod.POST)
    public String login(@RequestBody Candidato candidato){
      if(candidatoDAO.Verificausuario(candidato)){
          return "OK";
      }
      return "No ok";
    }
}
