package classes;

public class Prestamos {
    String identificacion;
    String nombre_persona;
    int edad;
    String dui;
    String fecha_prestamo;
    String fecha_fin_prestamo;

    public Prestamos(String identificacion, String nombre_persona, int edad, String dui, String fecha_prestamo, String fecha_fin_prestamo) {
        this.identificacion = identificacion;
        this.nombre_persona = nombre_persona;
        this.edad = edad;
        this.dui = dui;
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_fin_prestamo = fecha_fin_prestamo;
    }
}