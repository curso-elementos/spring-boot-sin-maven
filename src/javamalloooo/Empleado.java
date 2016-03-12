/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamalloooo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author campitos
 */
@Entity
@Table(name="empleado")
public class Empleado {
    @Id
    @GeneratedValue
    @Column(name="id_empleado")
    private Integer id;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="paterno")
    private String paterno;
    
    @Column(name="login")
    private String login;
    
    @Column(name="password")
    private Integer pasword;

    public Empleado() {
    }

    public Empleado(Integer id) {
        this.id = id;
    }

    public Empleado(String nombre, String paterno, String login, Integer pasword) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.login = login;
        this.pasword = pasword;
    }
    

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the paterno
     */
    public String getPaterno() {
        return paterno;
    }

    /**
     * @param paterno the paterno to set
     */
    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the pasword
     */
    public Integer getPasword() {
        return pasword;
    }

    /**
     * @param pasword the pasword to set
     */
    public void setPasword(Integer pasword) {
        this.pasword = pasword;
    }
    
}
