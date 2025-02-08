package impl;

import models.IEstrategiasEnvio;
import models.InterfazUsuario;

import java.util.Scanner;

public class InterfazUsuarioConsola implements InterfazUsuario {

    private Scanner scanner = new Scanner(System.in);

    private enum PRODUCTO {
        Camiseta,
        Pantalones,
        Zapatillas
    }

    public InterfazUsuarioConsola() {}

    @Override
    public void interactuarUsuario() {

        System.out.println("Ingrese el nombre del producto que quiere enviar: ");

        for (PRODUCTO producto : PRODUCTO.values()) {
            System.out.println(producto.name());
        }

        String productoIngresado = scanner.nextLine();

        PRODUCTO productoSeleccionado;
        try {
            productoSeleccionado = PRODUCTO.valueOf(productoIngresado);
            System.out.println("Producto seleccionado: " + productoSeleccionado);

        } catch (IllegalArgumentException e) {
            System.out.println("Producto no válido. Por favor, elija un producto válido de la lista.");
            return;
        }


        System.out.println("Selecciona el tipo de envío:");
        System.out.println("1. Envío por aire");
        System.out.println("2. Envío por tierra");
        System.out.println("3. Envío por mar");


        int opcion = scanner.nextInt();


        IEstrategiasEnvio estrategia = null;

        switch (opcion) {
            case 1:
                estrategia = new EnvioAire();
                break;
            case 2:
                estrategia = new EnvioTierra();
                break;
            case 3:
                estrategia = new EnvioMar();
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        Envio envio = new Envio(estrategia, productoIngresado);
        envio.realizarEnvio();

    }
}
