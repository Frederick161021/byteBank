import com.bytebank.modelo.Contador;
import com.bytebank.modelo.Funcionario;
import com.bytebank.modelo.Gerente;
import com.bytebank.modelo.ControlBonificacion;

public class testFuncionario {

    public static void main(String[] args) {
        ControlBonificacion control = new ControlBonificacion();
        
        Funcionario funcionario = new Contador();
        funcionario.setNombre("Pedro");
        funcionario.setDocumento("Docuemnto generico xd");
        funcionario.setSalario(2000);
        funcionario.setTipo(1);
        
        
        Gerente gerente = new Gerente();
        gerente.setNombre("Jade");
        gerente.setDocumento("Muchos Documentos Juridicos");
        gerente.setClave("delorian");
        gerente.setSalario(4000);
        gerente.setTipo(0);
        
        System.out.println(funcionario.toString());
        System.out.println(funcionario.getBonificacion());
        control.registrarSalario(funcionario);
        System.out.println(gerente.toString());
        System.out.println(gerente.getBonificacion());
        System.out.println(gerente.iniciarSesion(gerente.getClave()));
        control.registrarSalario(gerente);
    }
    
}
