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
public class Autenticar {
    
    private String claveUsuario = "peopodrido";
    
    public String getClaveUsuario(){
        return claveUsuario;
    }
    
    public boolean validarClave(String clave){
        if(clave.equals(claveUsuario)){
            System.out.println("Clave Correcta");
            return true;
        }else{        
            System.out.println("Clave Incorrecta");
        }
        return false;
    }
    
}
