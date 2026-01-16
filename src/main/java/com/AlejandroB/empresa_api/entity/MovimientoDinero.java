package com.AlejandroB.empresa_api.entity;

/**
 *
 * Esta clase ...
 *
 * @Author: Alejandro Betanzos Álvarez
 * @Versión: 2026, 01
 */
public class MovimientoDinero {
    private double monto;
    private String concepto;

    public MovimientoDinero(double monto, String concepto) {
        this.monto = monto;
        this.concepto = concepto;
    }

    public double getMonto() { return monto; }
    public void setMonto(double monto) { this.monto = monto; }

    public String getConcepto() { return concepto; }
    public void setConcepto(String concepto) { this.concepto = concepto; }
}
