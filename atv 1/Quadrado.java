package com.mycompany.quadrado;
public class Quadrado {

    public static void main(String[] args) {
        Quadradin calculo = new Quadradin();
        
        calculo.setLado(3);
        calculo.calcularArea(3);
        
        System.out.println("lado: " + calculo.getLado());
        System.out.println("Area: " + calculo.getArea());
    }
}
