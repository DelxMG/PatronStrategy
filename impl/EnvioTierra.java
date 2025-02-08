package impl;

import models.IEstrategiasEnvio;

public class EnvioTierra implements IEstrategiasEnvio {

    @Override
    public void enviarProducto(String producto) {
        System.out.println("Enviando el producto " + producto + " por tierra.");
    }
}

