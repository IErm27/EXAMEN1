/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerexamen.isaacramirez;

/**
 *
 * @author isaac
 */
public class Vendedor {

    //Se declaran variables para obtener los datos del agente de ventas
    private String nombre;
    private String cedula;
    private String codigo;
    private String sucursal;
    private boolean vehiculo;
    private double totalFacturado;
    private double comisiones;
    private int puntos;
    private int cantidadFacturas;

    //datos de agente
    public Vendedor(String nombre, String cedula, String codigo, String sucursal, boolean vehiculo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.codigo = codigo;
        this.sucursal = sucursal;
        this.vehiculo = vehiculo;
        this.totalFacturado = 0;
        this.comisiones = 0;
        this.puntos = 0;
        this.cantidadFacturas = 0;
    }

    //facturacion
    public void facturacion(facturas factura) {
        this.totalFacturado += factura.getmontoapagar();
        this.comisiones += factura.calculocomision();
        this.puntos += factura.calculopuntos();
        this.cantidadFacturas++;
    }

    //get
    public double gettotalFacturado() {
        return totalFacturado;
    }

    public double getcomisiones() {
        return comisiones;
    }

    public int getpuntos() {
        return puntos;
    }

    public int getcantidadFacturas() {
        return cantidadFacturas;
    }

    public boolean vehiculo() {
        return vehiculo;
    }

    public String getsucursal() {
        return sucursal;
    }

    public String getnombre() {
        return nombre;
    }

    public String getcodigo() {
        return codigo;
    }
}
