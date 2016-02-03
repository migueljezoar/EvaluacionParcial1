/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utsjr.clases;

/**
 *
 * @author JANELI
 */

public class Empleados {
    //atributos
    private  int idempleado;
    private  String nombreempleado;
    private  String apellidosempleado;
    private  int iddepartamento;

    public Empleados() {
    }

    public Empleados(int idempleado, String nombreempleado, String apellidosempleado, int iddepartamento) {
        this.idempleado = idempleado;
        this.nombreempleado = nombreempleado;
        this.apellidosempleado = apellidosempleado;
        this.iddepartamento = iddepartamento;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public String getNombreempleado() {
        return nombreempleado;
    }

    public void setNombreempleado(String nombreempleado) {
        this.nombreempleado = nombreempleado;
    }

    public String getApellidosempleado() {
        return apellidosempleado;
    }

    public void setApellidosempleado(String apellidosempleado) {
        this.apellidosempleado = apellidosempleado;
    }

    public int getIddepartamento() {
        return iddepartamento;
    }

    public void setIddepartamento(int iddepartamento) {
        this.iddepartamento = iddepartamento;
    }

   

  
   

    
}
