/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.laboratorio;

import java.util.ArrayList;
import java.util.List;
import udem.edu.co.interfaz.Servivo;
import udem.edu.co.referencia.Brocoli;
import udem.edu.co.referencia.Cilantro;
import udem.edu.co.referencia.Perro;

/**
 *
 * @author julio
 */
public class Principal {
    
    public static void main(String[] args){
    List<Servivo> servivos=new ArrayList<Servivo>();
    
    Brocoli brocoli1= new Brocoli("Brocoli","Planta","Verde lima",4,4);
    Perro perro1= new Perro("Lucas","Animal","Negro",20,10);
    Perro perro2= new Perro("Toto","Animal","Blanco",20,10);
    Cilantro cilantro1= new Cilantro("Cilantro","Planta","Verde Claro",5,7);
    servivos.add(cilantro1);
    servivos.add(perro2);
    servivos.add(perro1);
    servivos.add(brocoli1);
        System.out.println(servivos.toString());
       

    
    
    
    
    }
    
}
