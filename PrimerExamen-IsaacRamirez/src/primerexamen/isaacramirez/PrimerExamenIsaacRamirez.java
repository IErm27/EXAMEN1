/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerexamen.isaacramirez;
import javax.swing.JOptionPane;
/**
 *
 * @author isaac
 */
public class PrimerExamenIsaacRamirez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Solicitar los datos del agente de ventas
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del agente:");
        String cedula = JOptionPane.showInputDialog("Ingrese la cédula del agente:");
        String codigo = JOptionPane.showInputDialog("Ingrese el código del agente:");
        String sucursal = JOptionPane.showInputDialog("Ingrese el nombre de la sucursal a la que pertenece:");
        boolean vehiculo = JOptionPane.showConfirmDialog(null, "El agente tiene vehículo?", "vehículo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

        Vendedor vendedor = new Vendedor(nombre, cedula, codigo, sucursal, vehiculo);

        while (true) {
            //Solicitar los datos del cliente

            String nomcliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
            String cedcliente = JOptionPane.showInputDialog("Ingrese la cédula del cliente:");
            String codigoFactura = JOptionPane.showInputDialog("Ingrese el código de la factura:");
            double montoapagar = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a pagar de la factura:"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del mes entre el 1 al 12:"));
            while (mes < 1 || mes > 12) { //Si el usuario no ingresa lo solicitado se le solicita que ingrese el dato correcto
                mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del mes correcto porfavor"));
            }

            //Verificacion de los productos que puede contener la factura
            int productoElectrico = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos productos electricos contiene:"));
            int productoAutomotriz = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos productos de automotriz contiene:"));
            int productoConstruccion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos productos de construccion contiene:"));

            facturas factura = new facturas(nomcliente, cedcliente, codigoFactura, montoapagar, mes, productoElectrico, productoAutomotriz, productoConstruccion);
            vendedor.facturacion(factura);
            
            
        }
        
        
        
        
    }

}
