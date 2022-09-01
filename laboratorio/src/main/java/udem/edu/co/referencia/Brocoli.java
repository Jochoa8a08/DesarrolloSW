/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.referencia;
import udem.edu.co.abstractas.Brasicaceas;
import udem.edu.co.interfaz.Servivo;

/**
 *
 * @author julio
 */
public class Brocoli extends Brasicaceas implements  Servivo{
    private String nombre;
    private String reino;
    private String color;
    private float Longevidad;
    private float promediovida;

    @Override
    public String toString() {
        return "Brocoli{" + "nombre=" + nombre + ", reino=" + reino + ", color=" + color + ", Longevidad=" + Longevidad + ", promediovida=" + promediovida + '}';
    }

    

    public Brocoli(String nombre, String reino, String color, float Longevidad, float promediovida) {
        this.nombre = nombre;
        this.reino = reino;
        this.color = color;
        this.Longevidad = Longevidad;
        this.promediovida = promediovida;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }
    
    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getLongevidad() {
        return Longevidad;
    }

    public void setLongevidad(float Longevidad) {
        this.Longevidad = Longevidad;
    }

    public float getPromediovida() {
        return promediovida;
    }

    public void setPromediovida(float promediovida) {
        this.promediovida = promediovida;
    }

    @Override
    public int tipoServivo() {
      return 0;
    }

    
    
    
}
