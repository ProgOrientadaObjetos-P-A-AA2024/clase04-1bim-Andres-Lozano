
package paquete1;

public class ejecutableDos {
    public static void main(String[]args){
        Computadora personal = new Computadora ();
        personal.establecerTipoProcesador("Intel vPRo");
        
      
        System.out.printf("%s - %.2f",  personal.obtenerTipoProcesador(),
        personal.obtenerMemoria());
       
                
    }
}
