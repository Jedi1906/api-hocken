package com.hocken.hocken.model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table (name = "vacante")
public class Vacante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name="id_vacante")
    private int id_vacante;

    @Getter @Setter @Column(name="nombre_vac")
    private String nombre_vac;

    @Getter @Setter @Column(name="ubicacion")
    private String ubicacion;
    @Getter @Setter @Column(name="modalidad")
    private String modalidad;
    @Getter @Setter @Column(name="rango_sul")
    private String rango_sul;
    @Getter @Setter @Column(name="area")
    private String area;
    @Getter @Setter @Column(name="descripcion")
    private String descripcion;
    @Getter @Setter @Column(name="fecha_publ")
    private String fecha_publ;
    @Getter @Setter @Column(name="tipo_contrato")
    private String tipo_contrato;
    @Getter @Setter @Column(name="perfil_ideal")
    private String perfil_ideal;
    @Getter @Setter @Column(name="ofrecemos")
    private String ofrecemos;
    @Getter @Setter @Column(name="estado")
    private String estado;
    @Getter @Setter @Column(name="id_empresa")
    private int id_empresa;
}
