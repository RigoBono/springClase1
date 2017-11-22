/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author heltonsmith
 */
public class Auto {
    private int id;
    private String marca;
    private String color;

    public Auto(int id, String marca, String color) {
        this.id = id;
        this.marca = marca;
        this.color = color;
    }

    public Auto(int id) {
        this.id = id;
    }

    public Auto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
