package com.sv.grupo9.parcialprogramacion22026011587;

public class ComisionPersonalizada implements EstrategiaComision {

    private String nombre;

    public ComisionPersonalizada(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public double calcularComision(double montoVenta) {
        int n = nombre.length();
        return montoVenta * (5 + n) / 100;
    }
}