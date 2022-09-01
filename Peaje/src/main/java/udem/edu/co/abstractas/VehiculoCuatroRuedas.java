/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.abstractas;

/**
 *
 * @author julio
 */
public abstract class VehiculoCuatroRuedas {
    private int numruedas;

    public VehiculoCuatroRuedas() {
        this.numruedas = 4;
    }

    public int getNumruedas() {
        return numruedas;
    }

    public void setNumruedas(int numruedas) {
        this.numruedas = numruedas;
    }
    
    @Override
    public String toString() {
        return "numruedas:" + getNumruedas();
    }
    
    
    
    
    
    
}
