/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pricipal;

import Controlador.Controlador;
import Modelo.Logica;
import com.udec.mvc.interfazUsuario;

/**
 *
 * @author David Arias
 */
public class Principal {

    /**
     * @param args the command line arguments
     * metodo por donde arranca el programa
     */
    public static void main(String[] args) {
       Logica mod = new Logica();
        interfazUsuario vis = new interfazUsuario();
       Controlador ctr = new Controlador(mod, vis);
       ctr.iniciar();
       vis.setVisible(true);
       mod.recorrer();
    }
}
