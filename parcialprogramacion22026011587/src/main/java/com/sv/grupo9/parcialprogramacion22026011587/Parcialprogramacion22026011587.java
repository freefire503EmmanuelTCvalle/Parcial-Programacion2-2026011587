package com.sv.grupo9.parcialprogramacion22026011587;

public class Parcialprogramacion22026011587 {

    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor(
                "Emmanuel",
                1000.00,
                new ComisionEstandar()
        );

        vendedor.mostrarDetalle();
    }
}