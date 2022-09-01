/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//A este pertenece el brocoli
package udem.edu.co.abstractas;

/**
 *
 * @author julio
 */
public class Brasicaceas {
    private String inflorescencia;

    public Brasicaceas(String inflorescencia) {
        this.inflorescencia = "centraltamañogrande";
    }

    public String getInflorescencia() {
        return inflorescencia + getInflorescencia();
    }

    public void setInflorescencia(String inflorescencia) {
        this.inflorescencia = inflorescencia;
    }

    @Override
    public String toString() {
        return "Brasicaceas{" + "inflorescencia=" + inflorescencia + '}';
    }

   
    
    
}
