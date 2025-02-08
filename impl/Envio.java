package impl;

import models.IEstrategiasEnvio;

public class Envio {
    private IEstrategiasEnvio estrategias;
    private String producto;

    public Envio(IEstrategiasEnvio estrategias, String producto) {
        this.estrategias = estrategias;
        this.producto = producto;
    }

    public void setEstrategias(IEstrategiasEnvio estrategias) {
        this.estrategias = estrategias;
    }

    public void realizarEnvio() {
        estrategias.enviarProducto(producto);
    }

}


