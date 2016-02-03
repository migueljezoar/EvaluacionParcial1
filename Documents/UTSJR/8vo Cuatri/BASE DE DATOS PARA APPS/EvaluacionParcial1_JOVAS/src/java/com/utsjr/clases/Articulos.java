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

public class Articulos {
    //atributos
    private  int idarticulo;
    private  String nombrearticulo;
    private  double precioarticulo;
    private  int idfabricante;

    public Articulos() {
    }

    public Articulos(int idarticulo, String nombrearticulo, double precioarticulo, int idfabricante) {
        this.idarticulo = idarticulo;
        this.nombrearticulo = nombrearticulo;
        this.precioarticulo = precioarticulo;
        this.idfabricante = idfabricante;
    }

    public int getIdarticulo() {
        return idarticulo;
    }

    public void setIdarticulo(int idarticulo) {
        this.idarticulo = idarticulo;
    }

    public String getNombrearticulo() {
        return nombrearticulo;
    }

    public void setNombrearticulo(String nombrearticulo) {
        this.nombrearticulo = nombrearticulo;
    }

    public double getPrecioarticulo() {
        return precioarticulo;
    }

    public void setPrecioarticulo(double precioarticulo) {
        this.precioarticulo = precioarticulo;
    }

    public int getIdfabricante() {
        return idfabricante;
    }

    public void setIdfabricante(int idfabricante) {
        this.idfabricante = idfabricante;
    }

   

    
}
