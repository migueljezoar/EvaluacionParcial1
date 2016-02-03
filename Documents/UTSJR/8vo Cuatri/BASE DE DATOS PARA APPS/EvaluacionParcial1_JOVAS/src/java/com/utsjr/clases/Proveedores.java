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

public class Proveedores {
    //atributos
    private  int idproveedor;
    private  String nombreproveedor;

    public Proveedores() {
    }

    public Proveedores(int idproveedor, String nombreproveedor) {
        this.idproveedor = idproveedor;
        this.nombreproveedor = nombreproveedor;
    }

    public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }

    public String getNombreproveedor() {
        return nombreproveedor;
    }

    public void setNombreproveedor(String nombreproveedor) {
        this.nombreproveedor = nombreproveedor;
    }

   
}
