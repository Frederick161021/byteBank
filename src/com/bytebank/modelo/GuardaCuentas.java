package com.bytebank.modelo;

/**
 *
 * @author togae
 */
public class GuardaCuentas {
    Cuenta[] cuenta = new Cuenta[10];
    int indice = 0;
    
    public void adicionar(Cuenta cc){
        cuenta[indice] = cc;
        indice ++;
    }
    
    public Cuenta obtener(int indice){
        return cuenta[indice]; 
    }
}
