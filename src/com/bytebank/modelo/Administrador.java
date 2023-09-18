package com.bytebank.modelo;

public class Administrador extends Funcionario implements Autenticable{
    private AutentificacionUtil util;
    
    public Administrador(){
        this.util = new AutentificacionUtil();
    }
    
    @Override
    public double getBonificacion() {
        return this.getSalario();
    }

    public String getClave() {
        return this.util.getClave();
    }

    public void setClave(String clave) {
        this.util.setClave(clave);
    }
    
    public boolean iniciarSesion(String clave){
        return this.util.iniciarSesion(clave);
    }
}
