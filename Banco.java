
/**
 * Write a description of class Banco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banco
{
    private double monto_actual;
    
    public void debito(double monto){
        if(monto>monto_actual){
            System.out.println("Insuficiente"); 
        }
        if (monto<0){
            System.out.println("Fuera de rango");
        }
        else
            monto_actual -= monto;
        }
    
    public double balanceActual(){
        return monto_actual;
    }
    
    public void setBalanceActual(double balanceActual){
        monto_actual = balanceActual;
    }
    
    public void setMontoAct(double monto_actual){
        monto_actual = this.monto_actual;
    }
}
