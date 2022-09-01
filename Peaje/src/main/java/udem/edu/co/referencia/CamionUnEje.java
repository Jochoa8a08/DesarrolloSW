/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.referencia;

/**
 *
 * @author julio
 */
public class CamionUnEje {
    private String placa;
    private String marca;
    private float valor;

    @Override
    public String toString() {
        return "CamionUnEje{" + "placa=" + placa + ", marca=" + marca + ", valor=" + valor + '}';
    }

    public CamionUnEje(String placa, String marca, float valor) {
        this.placa = placa;
        this.marca = marca;
        this.valor = valor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
}
