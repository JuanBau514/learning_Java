package control;

import modelo.*;
import vista.*;

public class controlador {

    public CajasMensaje caja;
    public Peaje peaje;
    public Pago pago;
    public Vehiculo vehiculo;

    public controlador() {
        caja = new CajasMensaje();
        peaje = new Peaje( 3, "Peaje 1", "Calle 1", "Lugar 1");
        pago = new Pago();
    }

    public void iniciar() {
       String menu;
       menu = "1. Ingresar Vehiculo\n 2. Calcular Pago\n 3. Salir";
        int opcion = 0;
        caja.mostrar("Bienvenido al sistema de peajes");
       
       while (opcion != 3) {
           opcion = caja.leerEntero(menu);
           switch (opcion) {
               case 1:
               caja.mostrar("que tipo de vehiculo es?");
               int tipo = caja.leerEntero("1. Carro\n 2. Moto\n 3. Camion\n ");                
                if (tipo == 1) {
                    caja.mostrar("Ingrese la marca del vehiculo");
                    String marca=caja.leerTexto("");
                    caja.mostrar("Ingrese la placa del vehiculo");
                    String placa=caja.leerTexto("");
                   
                    vehiculo = new Carro(marca, placa);
                } else if (tipo == 2) {
                    caja.mostrar("Ingrese la marca del vehiculo");
                    String marca = caja.getMsj();
                    caja.mostrar("Ingrese la placa del vehiculo");
                    String placa = caja.getMsj();
                    vehiculo = new Moto(marca, placa);
                } else if (tipo == 3) {
                    caja.mostrar("Ingrese la marca del vehiculo");
                    String marca = caja.getMsj();
                    caja.mostrar("Ingrese la placa del vehiculo");
                    String placa = caja.getMsj();
                    vehiculo = new Camion(marca, placa);
                } else {
                    caja.mostrar("Opcion no valida");
                } 
                   break;
               case 2:
               if (vehiculo != null) {
                     pago.setVehiculo(vehiculo);
                        pago.setPeaje(peaje);
                        pago.getPago();
                        caja.mostrar(pago.toString());
                } else {
                    caja.mostrar("No hay vehiculo");
                }
            
                   break;
               case 3:
                   caja.mostrar("Gracias por usar el sistema");
                   break;
               default:
                   caja.mostrar("Opcion no valida");
                   break;
           }
       }
    } 
}

