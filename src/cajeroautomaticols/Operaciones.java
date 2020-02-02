/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroautomaticols;

/**
 *
 * @author lserrano
 */
public class Operaciones {
    
    private int saldo = 500;
    
    public int getSaldo(){
        return saldo;
    }
    
    public void setSaldo(int monto){
        this.saldo = monto;
    }
    
    public void deposito(int monto){
        setSaldo(getSaldo() + monto);
    }
    
    public void retiro(int monto){      
        setSaldo(getSaldo() - monto);           
    }
    
    public String excedeMonto(){
        return "----------------------\n"
                + "El monto solicitado excede su saldo actual\n"
                + "--------------------------";
    }
}
