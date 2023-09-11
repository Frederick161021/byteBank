package bytebank;

public class CuentaCorriente  extends Cuenta{
    
    public CuentaCorriente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        this.saldo += valor; 
    }
    
}
