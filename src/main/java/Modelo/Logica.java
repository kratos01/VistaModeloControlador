/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author David Arias
 * clase que contiene la logica del modelo
 */
public class Logica {
 /**
  * variable nombre recoje lo que se coloqe en la caja de texto
  * lista que guarda los nombres
  */
     List<String> lista = new ArrayList<>();
    private String nombre;
/**
 * costructor de la clase que recibe el nombre
 * @param nombre 
 */
    public Logica(String nombre) {
        this.nombre = nombre;
    }
/**
 * costructor vacio de la clase 
 */
    public Logica() {
        
    }
/**
 * 
 * @return un objeto tipo lista  
 */
    public List<String> getLista() {
        return lista;
    }
/**
 * captura los valores en la lista 
 * @param lista 
 */
    public void setLista(List<String> lista) {
        this.lista = lista;
    }

    /**
     * 
     * @return el nombre  
     */
    public String getNombre() {
        return nombre;
    }
/**
 * captura el nombre 
 * @param Nombre 
 */
    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }
/**
 * metodo que inserta valores a la lista 
 */
   public void insertar(){
      

       this.lista.add(this.nombre);
   }
    /**
     * metodo que recorre la lsita 
     * @return la lista para mostrarla en el text area
     */
   public List recorrer(){
       for(String a : this.lista){
      
           System.out.println("entro" + a);
       }
       return this.lista;
   }
}
