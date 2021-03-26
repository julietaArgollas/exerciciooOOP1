package com.company;

public class Automovil extends com.company.Vehiculo{
    private String capacidad;

    public Automovil(String modelo, String marca, String kilometraje, Double costo, String state, String capacidad) {
        super(modelo, marca, kilometraje, costo, state);
        this.capacidad = capacidad;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return super.toString() + "{Camioneta = capacidad: " + capacidad.toString() +"}";
    }
}
