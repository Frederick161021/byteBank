package com.bytebank.modelo;

public class SistemaInterno {
    
    private String clave = "12345";
    
    public void autenticar(Autenticable au) {
        boolean autentico = au.iniciarSesion(this.clave);
        if (autentico) {
            System.out.println("Login Exitoso");
        }
        else{
            System.out.println("Error en Login");
        }
    }
}
