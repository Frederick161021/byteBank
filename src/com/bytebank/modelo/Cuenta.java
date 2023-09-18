package com.bytebank.modelo;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Cuenta {
    protected double saldo;
    private int agencia = 1;
    private int numero;
    private Cliente titular = new Cliente();
    private static int total;

    public Cuenta( int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Crear cuenta: " + this.numero);

        Cuenta.total ++;
    }

    public abstract void deposita(double valor);

    public void saca(double valor) {
        if(this.saldo < valor) {
            try {
                throw new SaldoInsuficienteException("No tienes saldo suficiente!");
            } catch (SaldoInsuficienteException ex) {
                System.out.println(ex.getMessage());
            }finally{//Se va a ejecutar si o si independientemente si hubo exito o error 
                System.out.println("Ejectando Finally");
            }
        } 
        this.saldo -= valor;
    }

    public boolean transfiere(double valor, Cuenta destino) {
        if(this.saldo >= valor) {
            saca(valor);
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Cuenta.total;
    }
}