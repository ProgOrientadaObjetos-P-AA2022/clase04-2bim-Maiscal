/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilDiesel extends Automovil {

    private double numeroLimax;
    private double costolitro;
    private double descuentol;

    public void establecernumeroLimax(double numero) {
        numeroLimax = numero;
    }

    public void establecercostolitro(double valor) {
        costolitro = valor;
    }

    public void establecerdescuentol(double desc) {
        descuentol = desc;
    }

    @Override
    public void calcularValorCancelar() {
        valorCancelar = numeroLimax - ((numeroLimax * descuentol) / 100) ;
        valorCancelar = valorCancelar * costolitro;
    }

    public double obtenernumeroLimax() {
        return numeroLimax;
    }

    public double obtenercostolitro() {
        return costolitro;
    }

    public double obtenerdescuentol() {
        return descuentol;
    }

    public String toString() {
        String c = String.format("%s\nNumero de litros: %.2f\n"
                + "Costo de litros: %.2f\n"
                + "Descuento: %.2f\n"
                ,super.toString()
                ,numeroLimax
                ,costolitro
                ,descuentol
        );
        return c;
    }
}
