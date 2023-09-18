package com.bytebank.modelo;

public class ControlBonificacion {
    private double suma = 0;
    
    public double registrarSalario(Funcionario funcionario){
        this.suma += funcionario.getBonificacion();
        System.out.println("Calculo Total: " + this.suma);
        return this.suma;
    }
    
}
