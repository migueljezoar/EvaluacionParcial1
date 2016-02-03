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

public class Cajas {
    //atributos
    private  int idcaja;
    private  String contenido;
    private  double valor;
    private  int idalmacen;

    public Cajas() {
    }

    public Cajas(int idcaja, String contenido, double valor, int idalmacen) {
        this.idcaja = idcaja;
        this.contenido = contenido;
        this.valor = valor;
        this.idalmacen = idalmacen;
    }

    public int getIdcaja() {
        return idcaja;
    }

    public void setIdcaja(int idcaja) {
        this.idcaja = idcaja;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getIdalmacen() {
        return idalmacen;
    }

    public void setIdalmacen(int idalmacen) {
        this.idalmacen = idalmacen;
    }

   

  
   

    
}
