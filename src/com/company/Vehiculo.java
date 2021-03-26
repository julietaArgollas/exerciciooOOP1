package com.company;

public class Vehiculo {
    private String modelo;
    private String marca;
    private String kilometraje;
    private Double costo;
    private String state;

    public Vehiculo(String modelo, String marca, String kilometraje, Double costo, String state) {
        this.modelo = modelo;
        this.marca = marca;
        this.kilometraje = kilometraje;
        this.costo = costo;
        this.state = state;
    }

    public void aplicarDescuento(Integer porcentaje){
        Double total = getCosto();
        setCosto(total*porcentaje/100);
    }

    public void pagarCuota(Double monto){
        Double total = getCosto();
        setCosto(total-monto);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", kilometraje='" + kilometraje + '\'' +
                ", costo=" + costo +
                ", state='" + state + '\'' +
                '}';
    }
}