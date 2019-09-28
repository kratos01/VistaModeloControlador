/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Logica;
import com.udec.mvc.interfazUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author David Arias
 * clase que me conecta la vista y el modelo 
 */
public class Controlador implements ActionListener{
    private Logica modelo;
    private interfazUsuario vista;
/**
 * costructor de la clase que recibe los parametros de la vista y el modelo
 * @param modelo
 * @param vista 
 */
    public Controlador(Logica modelo, interfazUsuario vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.jButton1.addActionListener(this);
        
    }
    /**
     * metodo por donde inicia la interfaz de usuario
     */
    public void iniciar(){
        vista.setTitle("Ventana MVC");
        vista.setLocationRelativeTo(null);
    }
/**
 * metodo que se implementa de la interfaz Action listener 
 * @param e que es el escuchador del boton
 */
    @Override
    public void actionPerformed(ActionEvent e) {     
    modelo.setNombre(vista.jTextField1.getText());
    modelo.insertar();
    vista.jTextArea2.setText(String.valueOf(modelo.recorrer()));
    vista.jTextField1.setText(" ");
    }
    

}
