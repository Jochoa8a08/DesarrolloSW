/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.peaje;

import java.util.ArrayList;
import java.util.List;
import udem.edu.co.interfaz.Vehiculo;
import udem.edu.co.referencia.Automovil;

/**
 *
 * @author julio
 */
public class Principal {
    public static void main(String[] args){
    List<Vehiculo> vehiculos=new ArrayList<Vehiculo>();
    Automovil auto1= new Automovil("HUD-234","AUDI",10000);
        vehiculos.add(auto1);
        System.out.println(vehiculos.toString());
    
    
 
    
    
    }
    
}
