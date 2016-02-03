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

public class Departamentos {
    //atributos
    private  int iddepartamento;
    private  String nombredepartamento;
     private  double presupuestodepartamento;

    public Departamentos() {
    }

    public Departamentos(int iddepartamento, String nombredepartamento, double presupuestodepartamento) {
        this.iddepartamento = iddepartamento;
        this.nombredepartamento = nombredepartamento;
        this.presupuestodepartamento = presupuestodepartamento;
    }

    public int getIddepartamento() {
        return iddepartamento;
    }

    public void setIddepartamento(int iddepartamento) {
        this.iddepartamento = iddepartamento;
    }

    public String getNombredepartamento() {
        return nombredepartamento;
    }

    public void setNombredepartamento(String nombredepartamento) {
        this.nombredepartamento = nombredepartamento;
    }

    public double getPresupuestodepartamento() {
        return presupuestodepartamento;
    }

    public void setPresupuestodepartamento(double presupuestodepartamento) {
        this.presupuestodepartamento = presupuestodepartamento;
    }

   
    
}
