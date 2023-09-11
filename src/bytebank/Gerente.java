package bytebank;

public class Gerente extends Funcionario implements Autenticable{
    private AutentificacionUtil util;

    public String getClave() {
        return this.util.getClave();
    }

    public void setClave(String clave) {
        this.util.setClave(clave);
    }
    
    public boolean iniciarSesion(String clave){
        return util.iniciarSesion(clave);
    }

    @Override
    public double getBonificacion() {
        return this.getSalario()*2;
    }
}
