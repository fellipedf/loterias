package br.com.dev4j.loterias.model;

public class Dezena {

    private Integer numero;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return ""+ numero;
    }
}
