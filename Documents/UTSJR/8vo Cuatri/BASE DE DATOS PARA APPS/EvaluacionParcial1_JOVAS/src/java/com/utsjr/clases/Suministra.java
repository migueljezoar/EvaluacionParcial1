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

public class Suministra {
    //atributos
    private  int idpieza;
     private  int idproveedor;
     private  double precio;

    public Suministra() {
    }

    public Suministra(int idpieza, int idproveedor, double precio) {
        this.idpieza = idpieza;
        this.idproveedor = idproveedor;
        this.precio = precio;
    }

    public int getIdpieza() {
        return idpieza;
    }

    public void setIdpieza(int idpieza) {
        this.idpieza = idpieza;
    }

    public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    

   
    
}
