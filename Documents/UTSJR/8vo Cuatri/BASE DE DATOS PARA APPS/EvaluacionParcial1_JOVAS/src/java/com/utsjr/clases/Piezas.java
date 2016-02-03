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

public class Piezas {
    //atributos
    private  int idpieza;
    private  String nombrepieza;


    public Piezas() {
    }

    public Piezas(int idpieza, String nombrepieza) {
        this.idpieza = idpieza;
        this.nombrepieza = nombrepieza;
    }

    public int getIdpieza() {
        return idpieza;
    }

    public void setIdpieza(int idpieza) {
        this.idpieza = idpieza;
    }

    public String getNombrepieza() {
        return nombrepieza;
    }

    public void setNombrepieza(String nombrepieza) {
        this.nombrepieza = nombrepieza;
    }

       
}
