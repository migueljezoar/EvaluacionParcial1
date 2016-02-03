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

public class Salas {
    //atributos
    private  int idsala;
    private  String nombresala;
     private  int idpelicula;

    public Salas() {
    }

    public Salas(int idsala, String nombresala, int idpelicula) {
        this.idsala = idsala;
        this.nombresala = nombresala;
        this.idpelicula = idpelicula;
    }

    public int getIdsala() {
        return idsala;
    }

    public void setIdsala(int idsala) {
        this.idsala = idsala;
    }

    public String getNombresala() {
        return nombresala;
    }

    public void setNombresala(String nombresala) {
        this.nombresala = nombresala;
    }

    public int getIdpelicula() {
        return idpelicula;
    }

    public void setIdpelicula(int idpelicula) {
        this.idpelicula = idpelicula;
    }

   
    
}
