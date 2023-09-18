import com.bytebank.modelo.Conexion;

public class TestConecion {

    public static void main(String[] args) throws Exception {
        try(Conexion con = new Conexion()){
            con.LeerDatos();
        }catch(IllegalStateException ex){
            System.out.println("Ejecutando catch");
            ex.printStackTrace();
        }
        
//        Conexion con = null;
//        try{
//            con = new Conexion();
//            con.LeerDatos();
//        }catch(IllegalStateException ex){
//            ex.printStackTrace();
//        }
//        finally{
//            System.out.println("Ejecutando finally");
//            if (con != null) {
//                con.close();
//            }
//        }
    }
    
}
