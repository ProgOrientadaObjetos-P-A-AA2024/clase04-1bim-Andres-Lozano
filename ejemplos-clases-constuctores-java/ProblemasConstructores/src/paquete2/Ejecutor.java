
package paquete2;

import java.util.Scanner;

public class Ejecutor {
    public static void main(String[] args) {
        
        /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del hospital");
        String a = sc.nextLine();
        System.out.println("Ingrese la ciudad");
        String b = sc.nextLine();
        System.out.println("Ingrese el numero de doctores");
        int c =sc.nextInt();
          System.out.println("Ingrese el numero de enfermeros");
        int d =sc.nextInt();
        
        
        
                
        Hospital h1 = new Hospital(a,b,c,d);
        
    
      
        
        System.out.println( h1);
        
        
    }
}
