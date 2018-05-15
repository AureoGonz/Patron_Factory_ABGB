/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author Benjiman
 */
public class HTC implements Mobile{
    
    private String modelo;
    private int ram;
    private int megapixeles;

    public HTC(String modelo, int ram, int megapixeles) {
        this.modelo = modelo;
        this.ram = ram;
        this.megapixeles = megapixeles;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMegapixeles() {
        return megapixeles;
    }

    public void setMegapixeles(int megapixeles) {
        this.megapixeles = megapixeles;
    }
    
    
    
}
