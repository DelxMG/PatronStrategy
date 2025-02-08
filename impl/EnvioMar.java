package impl;

import models.IEstrategiasEnvio;

public class EnvioMar implements IEstrategiasEnvio {

    @Override
    public void enviarProducto(String producto) {
        System.out.println("Enviando el producto " + producto + " por mar.");
    }
}
