package control;

import modelo.*;
import vista.*;

public class controlador {

    public CajasMensaje caja;
    public Cuenta usuario1;
    public Cajero atm;

    public controlador() {
        usuario1 = new Cuenta(123456789, "Juan Perez", 1000, "Banco de Mexico");
        atm = new Cajero(2000);
        caja = new CajasMensaje();
    }

    public void inicio() {

        String menu;
        menu = "1. Depositar\n2. Retirar\n3. Transferir\n4. Consultar\n5. Salir";
        int opcion = 0;
        caja.mostrar("Bienvenido al cajero");

        while (opcion != 5) {
            opcion = caja.leerEntero(menu);
            switch (opcion) {
                case 1:
                    double cantidad = caja.leerDecimal("Cantidad a depositar");
                    atm.depositar(usuario1, cantidad);
                    caja.mostrar("Deposito realizado Su saldo es de: " + usuario1.getSaldo() + " pesos");
                    break;
                case 2:

                    do {
                        cantidad = caja.leerDecimal("Cantidad a retirar");
                    } while (cantidad <= 0);

                    if (atm.getDinero() < cantidad) {
                        caja.mostrar("Saldo insuficiente");
                        break;
                    } else if (cantidad > usuario1.getSaldo()) {
                        caja.mostrar("Fondos insuficientes");
                        break;
                    }

                    atm.retirar(usuario1, cantidad);
                    caja.mostrar("Retiro realizado Su saldo es de: " + usuario1.getSaldo() + " pesos");

                    break;
                case 3:
                    do {
                        cantidad = caja.leerDecimal("Cantidad a Transferir");
                    } while (cantidad <= 0);

                    if (cantidad > usuario1.getSaldo()) {
                        caja.mostrar("Fondos insuficientes");
                        break;
                    }
                    Cuenta usuario2 = new Cuenta();
                    atm.transferir(usuario1, usuario2, cantidad);
                    caja.mostrar("Transferencia realizada Su saldo es de: " + usuario1.getSaldo() + " pesos");

                    break;
                case 4:
                    caja.mostrar(usuario1.toString());
                    break;
                case 5:
                    caja.mostrar("Gracias por usar nuestros servicios");
                    break;
                default:
                    caja.mostrar("Opcion no valida");
                    break;
            }
        }
    }

}
