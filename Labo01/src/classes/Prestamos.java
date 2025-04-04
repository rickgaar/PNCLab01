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

    // Lista de prestamos
    public void mostrarPrestamos() {
        System.out.println("Identificación: " + this.identificacion);
        System.out.println("Nombre de la persona: " + this.nombre_persona);
        System.out.println("Edad de la persona: " + this.edad);
        System.out.println("Dui: " + this.dui);
        System.out.println("Fecha de prestamo: " + this.fecha_prestamo);
        System.out.println("Fecha fin del prestamo: " + this.fecha_fin_prestamo);
    }

    public void datosDePersonasEnEstadoDePrestamo() {
        System.out.println("Identificación: " + this.identificacion);
        System.out.println("Fecha de inicio de prestamo: " +this.fecha_prestamo);
        System.out.println("Fecha final de prestamo: " +this.fecha_fin_prestamo);
        System.out.println("Persona que solicitó el libro: " +this.nombre_persona);
        System.out.println("Dui: " +this.dui);
    }

    public void datosDePersonasMenorDeEdad() {
        this.dui = "00000000-0";
        System.out.println("Identificación: " + this.identificacion);
        System.out.println("Fecha de prestamo: " + this.fecha_prestamo);
        System.out.println("Fecha fin del prestamo: " + this.fecha_fin_prestamo);
        System.out.println("Persona que solicitó el libro: " +this.nombre_persona);
        System.out.println("Dui: " + this.dui);
    }

    public int getEdad() {
        return this.edad;
    }
}