/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utsjr.dao;

import com.utsjr.clases.Almacenes;
import com.utsjr.clases.Articulos;
import com.utsjr.clases.Cajas;
import com.utsjr.clases.Departamentos;
import com.utsjr.clases.Empleados;
import com.utsjr.clases.Fabricantes;
import com.utsjr.clases.Peliculas;
import com.utsjr.clases.Piezas;
import com.utsjr.clases.Proveedores;
import com.utsjr.clases.Salas;
import com.utsjr.clases.Suministra;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JANELI
 */
public class CasosDAO {

    //atributos
    Connection con;
    Statement smt; //debe ser sql
    ResultSet rs;

    //constructor
    public CasosDAO() {
    }

    //método para hacer la conexión
    public void conectar() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/bdap",
                    "root",
                    "");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //método para desconectar la BD
    public void desconectar() throws SQLException {
        con.close();
    }

    //método para obtener un listado de registros
    public List<Fabricantes> getFabricantes() throws SQLException {
        conectar();
        smt = con.createStatement();
        rs = smt.executeQuery("select * from fabricantes order by idfabricante");

        //declaramos la variable que vamos a retornar
        List<Fabricantes> listaFabricantes = new ArrayList<Fabricantes>();

        while (rs.next()) {
            Fabricantes f = new Fabricantes();
            f.setIdfabricante(rs.getInt("idfabricante"));
            f.setNombrefabricante(rs.getString("nombrefabricante"));

            listaFabricantes.add(f);
        }
        desconectar();
        return listaFabricantes;
    }

    public List<Articulos> getArticulos() throws SQLException {
        conectar();
        smt = con.createStatement();
        rs = smt.executeQuery("select * from articulos order by idarticulo");

        //declaramos la variable que vamos a retornar
        List<Articulos> listaArticulos = new ArrayList<Articulos>();

        while (rs.next()) {
            Articulos a = new Articulos();
            a.setIdarticulo(rs.getInt("idarticulo"));
            a.setNombrearticulo(rs.getString("nombrearticulo"));
            a.setPrecioarticulo(rs.getDouble("precioarticulo"));
            a.setPrecioarticulo(rs.getDouble("idfabricante"));

            listaArticulos.add(a);
        }
        desconectar();
        return listaArticulos;
    }

    public List<Empleados> getEmpleados() throws SQLException {
        conectar();
        smt = con.createStatement();
        rs = smt.executeQuery("select * from empleados order by idempleado");

        //declaramos la variable que vamos a retornar
        List<Empleados> listaEmpleados = new ArrayList<Empleados>();

        while (rs.next()) {
            Empleados e = new Empleados();
            e.setIdempleado(rs.getInt("idempleado"));
            e.setNombreempleado(rs.getString("nombreempleado"));
            e.setApellidosempleado(rs.getString("apellidosempleado"));
            e.setIddepartamento(rs.getInt("iddepartamento"));

            listaEmpleados.add(e);
        }
        desconectar();
        return listaEmpleados;
    }

    public List<Departamentos> getDepartamentos() throws SQLException {
        conectar();
        smt = con.createStatement();
        rs = smt.executeQuery("select * from departamentos order by iddepartamento");

        //declaramos la variable que vamos a retornar
        List<Departamentos> listaDepartamentos = new ArrayList<Departamentos>();

        while (rs.next()) {
            Departamentos d = new Departamentos();
            d.setIddepartamento(rs.getInt("iddepartamento"));
            d.setNombredepartamento(rs.getString("nombredepartamento"));
            d.setPresupuestodepartamento(rs.getDouble("presupuestodepartamento"));

            listaDepartamentos.add(d);
        }
        desconectar();
        return listaDepartamentos;
    }

    public List<Almacenes> getAlmacenes() throws SQLException {
        conectar();
        smt = con.createStatement();
        rs = smt.executeQuery("select * from almacenes order by idalmacen");

        //declaramos la variable que vamos a retornar
        List<Almacenes> listaAlmacenes = new ArrayList<Almacenes>();

        while (rs.next()) {
            Almacenes al = new Almacenes();
            al.setIdalmacen(rs.getInt("idalmacen"));
            al.setLugar(rs.getString("lugar"));
            al.setCapacidad(rs.getInt("capacidad"));

            listaAlmacenes.add(al);
        }
        desconectar();
        return listaAlmacenes;
    }

    public List<Cajas> getCajas() throws SQLException {
        conectar();
        smt = con.createStatement();
        rs = smt.executeQuery("select * from cajas order by idcaja");

        //declaramos la variable que vamos a retornar
        List<Cajas> listaCajas = new ArrayList<Cajas>();

        while (rs.next()) {
            Cajas c = new Cajas();
            c.setIdcaja(rs.getInt("idcaja"));
            c.setContenido(rs.getString("contenido"));
            c.setValor(rs.getDouble("valor"));
            c.setIdalmacen(rs.getInt("idalmacen"));

            listaCajas.add(c);
        }
        desconectar();
        return listaCajas;
    }

    public List<Salas> getSalas() throws SQLException {
        conectar();
        smt = con.createStatement();
        rs = smt.executeQuery("select * from salas order by idsala");

        //declaramos la variable que vamos a retornar
        List<Salas> listaSalas = new ArrayList<Salas>();

        while (rs.next()) {
            Salas s = new Salas();
            s.setIdsala(rs.getInt("idsala"));
            s.setNombresala(rs.getString("nombresala"));
            s.setIdpelicula(rs.getInt("idpelicula"));

            listaSalas.add(s);
        }
        desconectar();
        return listaSalas;
    }

    public List<Peliculas> getPeliculas() throws SQLException {
        conectar();
        smt = con.createStatement();
        rs = smt.executeQuery("select * from peliculas order by idpelicula");

        //declaramos la variable que vamos a retornar
        List<Peliculas> listaPeliculas = new ArrayList<Peliculas>();

        while (rs.next()) {
            Peliculas p = new Peliculas();
            p.setIdpelicula(rs.getInt("idpelicula"));
            p.setTitulopelicula(rs.getString("titulopelicula"));
            p.setClasificacion(rs.getString("clasificacion"));

            listaPeliculas.add(p);
        }
        desconectar();
        return listaPeliculas;
    }

    public List<Piezas> getPiezas() throws SQLException {
        conectar();
        smt = con.createStatement();
        rs = smt.executeQuery("select * from piezas order by idpieza");

        //declaramos la variable que vamos a retornar
        List<Piezas> listaPiezas = new ArrayList<Piezas>();

        while (rs.next()) {
            Piezas pi = new Piezas();
            pi.setIdpieza(rs.getInt("idpieza"));
            pi.setNombrepieza(rs.getString("nombrepieza"));

            listaPiezas.add(pi);
        }
        desconectar();
        return listaPiezas;
    }

    public List<Suministra> getSuministra() throws SQLException {
        conectar();
        smt = con.createStatement();
        rs = smt.executeQuery("select * from suministra order by idpieza");

        //declaramos la variable que vamos a retornar
        List<Suministra> listaSuministra = new ArrayList<Suministra>();

        while (rs.next()) {
            Suministra su = new Suministra();
            su.setIdpieza(rs.getInt("idpelicula"));
            su.setIdproveedor(rs.getInt("idproveedor"));
            su.setPrecio(rs.getDouble("precio"));

            listaSuministra.add(su);
        }
        desconectar();
        return listaSuministra;
    }

    public List<Proveedores> getProveedores() throws SQLException {
        conectar();
        smt = con.createStatement();
        rs = smt.executeQuery("select * from proveedores order by idproveedor");

        //declaramos la variable que vamos a retornar
        List<Proveedores> listaProveedores = new ArrayList<Proveedores>();

        while (rs.next()) {
            Proveedores pro = new Proveedores();
            pro.setIdproveedor(rs.getInt("idproveedor"));
            pro.setNombreproveedor(rs.getString("nombreproveedor"));

            listaProveedores.add(pro);
        }
        desconectar();
        return listaProveedores;
    }
    
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //////////////////////////////CASO 3////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    
    
     //4.Obtener el valor promedio de las cajas de cada almacén
    public List<Cajas> getConsulta4() throws SQLException{
        conectar();
        smt=con.createStatement();
        rs=smt.executeQuery("select c.contenido,AVG(c.valor)"
                + " as Promedio,a.lugar from cajas as c inner JOIN "
                + "almacenes as a on c.idalmacen=a.idalmacen GROUP BY a.lugar");
        
        //declaramos la variable que vamos a retornar
        List<Cajas> listaAlmacenes=new ArrayList<Cajas>();
        
        while(rs.next()){
            Cajas c=new Cajas();
            Almacenes al = new Almacenes();
            c.setContenido(rs.getString("contenido"));
           // c.setPromedio(rs.getDouble("Promedio"));
            al.setLugar(rs.getString("lugar"));            
            listaAlmacenes.add(c);
        }
        desconectar();
        return listaAlmacenes;
    }
    
    
}
