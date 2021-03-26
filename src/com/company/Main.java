package com.company;

public class Main {

    public static void main(String[] args) {
        Automovil automovil1 = new Automovil("Toyota Corola", "Toyota", "0", 18000.0, "nuevo", "600 kg");
        System.out.println(automovil1.toString());
        automovil1.pagarCuota(5000.0);
        System.out.println(automovil1.toString());
    }
}
