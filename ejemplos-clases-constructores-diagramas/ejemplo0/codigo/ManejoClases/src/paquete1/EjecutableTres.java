/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Usuario iTC
 */
public class EjecutableTres {
    public static void main (String []arg){
        Computadora personal=new Computadora("Intel-x19", 6.1 + 4, 2);
        personal.establecerTipoProcesador("Intel vPRo");
        
        System.out.printf("%s-%.2f",
        personal.obtenerMemoria(),
        personal.obtenerTipoProcesador);
        
    }
}
