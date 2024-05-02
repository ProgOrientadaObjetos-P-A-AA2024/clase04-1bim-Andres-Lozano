
package paquete2;


public class Hospital {
    private String nombre;
    private String ciudad;
    private int numeroDoctores;
    private int numeroEnfermeros;
    
    public Hospital(String a ,String b,int c ,int d){
        nombre = a;
        ciudad = b;
        numeroDoctores = c;
        numeroEnfermeros = d;
    }
    
        
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerCiudad(String n){
        ciudad = n;
    }
    
    public void establecerNumeroDoctores(int n){
        numeroDoctores = n;
    }
    
    public void establecerNumeroEnfermeros(int n){
        numeroEnfermeros = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerCiudad(){
        return ciudad;
    }
    
    public int obtenerNumeroDoctores(){
        return numeroDoctores;
    }
    
    public int obtenerNumeroEnfermeros(){
        return numeroEnfermeros;
    }
    
 public String toString() {
        return "Hospital: " + nombre + "\nCiudad: " + ciudad + "\nNúmero de doctores: " + numeroDoctores +
               "\nNúmero de enfermeros: " + numeroEnfermeros;
    }
}
  
    

