package com.mycompany.quadrado;

public class Quadradin {
    public int lado;
    public int area;
    
    public int getLado() {
        return lado;
    }
    public int getArea() {
        return area;
    }
    public void setLado(int lado) {
        this.lado = lado;
    }
    public void calcularArea(int lado) {
        this.lado = lado;
        this.area = lado * lado;
    }
}
