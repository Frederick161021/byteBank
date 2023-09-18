
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;


public class TestExcpetionSaldo {
    public static void main(String[] args) {
        Cuenta cuenta = new CuentaAhorros(123, 456);
        cuenta.deposita(210);
        cuenta.getSaldo();
        cuenta.saca(200);
        cuenta.getSaldo();
        cuenta.saca(10);
        cuenta.getSaldo();
    }
    
}
