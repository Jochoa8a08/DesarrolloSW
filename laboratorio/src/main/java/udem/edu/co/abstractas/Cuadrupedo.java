/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//A esta pertenece el perro
package udem.edu.co.abstractas;

/**
 *
 * @author julio
 */
public class Cuadrupedo {
    private int numpatas;

    public Cuadrupedo() {
        this.numpatas = 4;
    }

    @Override
    public String toString() {
        return "Cuadrupedo{" + "numpatas=" + numpatas + '}';
    }

    public int getNumpatas() {
        return numpatas + getNumpatas();
    }

    public void setNumpatas(int numpatas) {
        this.numpatas = numpatas;
    }
    
    
    
}
