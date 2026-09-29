package com.sv.grupo9.parcialprogramacion22026011587;

public class ComisionEstandar implements EstrategiaComision {

    @Override
    public double calcularComision(double montoVenta) {
        return montoVenta * 0.05;
    }
}