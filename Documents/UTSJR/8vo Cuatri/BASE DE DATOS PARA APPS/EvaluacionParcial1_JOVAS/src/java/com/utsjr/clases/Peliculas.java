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

public class Peliculas {
    //atributos
    private  int idpelicula;
    private  String titulopelicula;
     private  String clasificacion;

    public Peliculas() {
    }

    public Peliculas(int idpelicula, String titulopelicula, String clasificacion) {
        this.idpelicula = idpelicula;
        this.titulopelicula = titulopelicula;
        this.clasificacion = clasificacion;
    }

    public int getIdpelicula() {
        return idpelicula;
    }

    public void setIdpelicula(int idpelicula) {
        this.idpelicula = idpelicula;
    }

    public String getTitulopelicula() {
        return titulopelicula;
    }

    public void setTitulopelicula(String titulopelicula) {
        this.titulopelicula = titulopelicula;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

   
}
