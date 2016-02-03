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

public class Fabricantes {
    //atributos
    private  int idfabricante;
    private  String nombrefabricante;

    public Fabricantes() {
    }

    public Fabricantes(int idfabricante, String nombrefabricante) {
        this.idfabricante = idfabricante;
        this.nombrefabricante = nombrefabricante;
    }

    public int getIdfabricante() {
        return idfabricante;
    }

    public void setIdfabricante(int idfabricante) {
        this.idfabricante = idfabricante;
    }

    public String getNombrefabricante() {
        return nombrefabricante;
    }

    public void setNombrefabricante(String nombrefabricante) {
        this.nombrefabricante = nombrefabricante;
    }
    
    
}
