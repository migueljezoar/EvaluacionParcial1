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

public class Almacenes {
    //atributos
    private  int idalmacen;
    private  String lugar;
     private  int capacidad;

    public Almacenes() {
    }

    public Almacenes(int idalmacen, String lugar, int capacidad) {
        this.idalmacen = idalmacen;
        this.lugar = lugar;
        this.capacidad = capacidad;
    }

    public int getIdalmacen() {
        return idalmacen;
    }

    public void setIdalmacen(int idalmacen) {
        this.idalmacen = idalmacen;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    
   
    
}
