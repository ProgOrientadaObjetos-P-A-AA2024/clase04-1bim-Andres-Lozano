package paquete3;

public class Hospital {
     private String nombre;
    private String ciudad;
    private int numeroDoctores;
    private int numeroEnfermeros;

    public Hospital() {
        nombre = "na";
        ciudad = "ciu";
        numeroDoctores = 100;
        numeroEnfermeros = 400;
    }

    public Hospital(String n, String ciu, int doctores, int enfermeros) {

        nombre = n;
        ciudad = ciu;
        numeroDoctores = doctores;
        numeroEnfermeros = enfermeros;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerCiudad(String n) {
        ciudad = n;
    }

    public void establecerNumeroDoctores(int n) {
        numeroDoctores = n;
    }

    public void establecerNumeroEnfermeros(int n) {
        numeroEnfermeros = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    public int obtenerNumeroDoctores() {
        return numeroDoctores;
    }

    public int obtenerNumeroEnfermeros() {
        return numeroEnfermeros;
    }

    @Override
    public String toString() {
    //se utliza ciudad por que esta declarado en emetodo mein y se lo puede escribir directamente sin tener que llmar al metodo
        String cadena = String.format("Nombre:%s\n Ciudad:%s\n"+"Numerode Doctores:%d\n"
                + "Numero de enfermos:%d\n",
               obtenerNombre(), 
               ciudad,
                obtenerNumeroDoctores(),
                obtenerNumeroEnfermeros());
                
        return cadena;
    }

}