
package paquete1;

/**
 *
 * @author Usuario iTC
 */
public class EjecutableDos {
    public static void main (String []arg){
        Computadora personal=new Computadora(24,0);
        personal.establecerTipoProcesador("R1");
        
        System.out.printf("%s-%.2f",
        personal.obtenerMemoria(),
        personal.obtenerTipoProcesador);
        
    }
    
}
