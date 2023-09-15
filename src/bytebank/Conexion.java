package bytebank;

public class Conexion implements AutoCloseable{
    
    public Conexion(){
        System.out.println("Abriendo conexion");
    }
    
    public void LeerDatos(){
        System.out.println("Recibiendo datos");
        throw new IllegalStateException();
    }
    
    public void Cerrar(){
        System.out.println("Cerrando conexion");
    }
    
    @Override
    public void close() throws Exception {
        Cerrar();
    }
    
}
