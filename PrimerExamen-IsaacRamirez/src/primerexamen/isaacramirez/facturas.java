/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerexamen.isaacramirez;

/**
 *
 * @author isaac
 */
public class facturas {

    private String nomcliente;
    private String cedcliente;
    private String codigoFactura;
    private double montoapagar;
    private int mes;
    private int productoElectrico;
    private int productoAutomotriz;
    private int productoConstruccion;

    public facturas(String nomcliente, String cedcliente, String codigoFactura, double pagar, int mes,
            int productoElectrico, int productoAutomotriz, int productoConstruccion) {
        this.nomcliente = nomcliente;
        this.cedcliente = cedcliente;
        this.codigoFactura = codigoFactura;
        this.montoapagar = montoapagar;
        this.mes = mes;
        this.productoElectrico = productoElectrico;
        this.productoAutomotriz = productoAutomotriz;
        this.productoConstruccion = productoConstruccion;
    }

    public double getmontoapagar() {
        return montoapagar;
    }

    public double calculocomision() {
        double comisiones = 0;

        if (productoElectrico >= 3) {
            comisiones += montoapagar * 0.04;
        } else if (productoElectrico > 0) {

            comisiones += montoapagar * 0.02;
        }

        if (productoAutomotriz > 4) {
            comisiones += montoapagar * 0.04;
        } else if (productoAutomotriz > 0) {
            comisiones += montoapagar * 0.02;
        }

        if (productoConstruccion > 0) {
            comisiones += montoapagar * 0.08;
        }

        if (montoapagar > 50000) {
            comisiones += montoapagar * 0.05;
        }

        return comisiones;
    }

    public int calculopuntos() {
        int puntos = 0;

        if (productoElectrico >= 3) {
            puntos += 1;
        }
        if (productoAutomotriz > 4) {
            puntos += 1;
        }
        if (productoConstruccion > 0) {
            puntos += 2;
        }
        if (montoapagar > 50000) {
            puntos += 1;
        }
        return puntos;
    }
}
