package com.hocken.hocken.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name ="id_empresa")
    private int id_empresa;
    @Getter @Setter @Column(name ="nombre_empresa")
    private String nombre_empresa;
    @Getter @Setter @Column(name ="titular")
    private String titular;
    @Getter @Setter @Column(name ="email")
    private String email;
    @Getter @Setter @Column(name ="telefono")
    private String telefono;
    @Getter @Setter @Column(name ="posicion_reclutar")
    private String posicion_reclutar;
    @Getter @Setter @Column(name ="rengo_sueldo")
    private String rengo_sueldo;
    @Getter @Setter @Column(name ="id_admin")
    private int id_admin;
}
