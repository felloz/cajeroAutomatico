/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroautomaticols;

import java.util.Scanner;
import static java.lang.System.out;

/**
 *
 * @author lserrano
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String claveUsuario = "";
        byte opcionSeleccionada = 0;
        Autenticar autentico = new Autenticar();
        Operaciones operando = new Operaciones();
        Scanner dato = new Scanner(System.in);
        int i = 0;
        
        for (i = 0; i < 3; i++) {
            
            out.print("Por favor ingrese su contraseña: ");
            claveUsuario = dato.next();
            if (i == 2) {
                out.println("Numero de Intentos Excedido");
            }
            
            if (autentico.validarClave(claveUsuario) == true) {
                
                while (opcionSeleccionada != 4) {
                    out.println("Por favor Seleccione una opción: \n"
                            + "1. Consulta de Saldo.\n"
                            + "2. Retiro de Efectivo.\n"
                            + "3. Depósito de Efectivo.\n"
                            + "4. Salir.");
                    out.print("Que operación desea realizar, escriba el número de la opción: ");
                    opcionSeleccionada = dato.nextByte();
                    switch (opcionSeleccionada) {
                        //comparing value of variable against each case
                        case 1:
                            int saldo = operando.getSaldo();
                            out.println("--------------------------\n"
                                    + "Su saldo actual es de: " + saldo + "\n"
                                    + "---------------------------");
                            break;
                        case 2:
                            out.print("Ingrese el monto que desea retirar: ");
                            int montoRetiro = dato.nextInt();
                            if (montoRetiro > operando.getSaldo()) {
                                out.println(operando.excedeMonto());
                                break;
                            } else {
                                operando.retiro(montoRetiro);
                                out.println("--------------------------\n"
                                        + "Ha retirado " + montoRetiro + " Su saldo actual es de: " + operando.getSaldo() + "\n"
                                        + "---------------------------");
                            }
                            break;
                        case 3:
                            out.print("Ingrese el monto que desea depositar: ");
                            int montoDeposito = dato.nextInt();
                            operando.deposito(montoDeposito);
                            out.println("--------------------------\n"
                                    + "Ha depositado " + montoDeposito + "Su saldo actual es de: " + operando.getSaldo() + "\n"
                                    + "---------------------------");
                            break;
                        case 4:
                            out.println("Saliendo...!");
                            operando.opcionSeleccionada(opcionSeleccionada);
                            break;
                        //optional
                        default:
                            out.println("------------------------\n"
                                    + "Opcion no valida, intente de nuevo\n"
                                    + "----------------------------");
                    }

                }
                }

            
        }
       
    }

}
