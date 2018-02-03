import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestBanco.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestBanco
{
  
    @Test
    public void testDelBanco(){
        double balance_inicial = 12.0;
        double monto_debitar = 4.0;
        double balance_final = 8.0;
        
        Banco banco = new Banco();
        banco.setBalanceActual(balance_inicial);
        banco.debito(monto_debitar);
        
        double actual = banco.balanceActual();
        
        assertEquals(balance_final, actual, 0.0);
    }
}
