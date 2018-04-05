package datosdavid;

public class DatosDavid {
    String nombres = "David Enmanuel";
    String apellidos = "Pérez Bayona";
    int edad = 20;
    String nacimiento = "26/09/1997";
    String carnet = "00152517";
    String carrera = "Ingeniería Informática";
    
    public void datospersonales(){
        System.out.println("Nombres: "+ nombres);
        System.out.println("Apellidos: "+ apellidos);
        System.out.println("Edad: "+ edad + " años");
        System.out.println("Fecha de nacimiento: "+ nacimiento);
        System.out.println("Carnet: "+carnet);
        System.out.println("Carrera: "+ carrera);
    }

    public static void main(String[] args) {
        DatosDavid obj = new DatosDavid();
        obj.datospersonales();
    }
}
