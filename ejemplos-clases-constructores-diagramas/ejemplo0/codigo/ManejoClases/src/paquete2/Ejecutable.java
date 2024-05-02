
package paquete2;

public class ejecutable {
    public static void main(String[]args){
        Computadora portatil = new Computadora("Intel-x19",6.1+4.2);
        
        System.out.println(portatil.obtenerMemoria());
        System.out.println(portatil.obtenerTipoProcesador());
    }
    
}
