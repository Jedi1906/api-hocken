package com.hocken.hocken.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "candidato")
public class Candidato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column (name = "id_candidato")
    private int id_candidato;
    @Getter @Setter @Column (name = "nombre")
    private String nombre;
    @Getter @Setter @Column (name = "apellido")
    private String apellido;
    @Getter @Setter @Column (name = "correo")
    private String correo;
    @Getter @Setter @Column (name = "telefono")
    private String telefono;
    @Getter @Setter @Column (name = "fecha_nac")
    private String fecha_nac;
    @Getter @Setter @Column (name = "ciudad_residencia")
    private String ciudad_residencia;
    @Getter @Setter @Column (name = "puesto_anterior")
    private String puesto_anterior;
    @Getter @Setter @Column (name = "contrasena")
    private String contrasena;
    @Getter @Setter @Column (name = "area_funcional")
    private String area_funcional;
    @Getter @Setter @Column (name = "cv")
    private String cv;
    @Getter @Setter @Column (name = "estado")
    private String estado;
}
