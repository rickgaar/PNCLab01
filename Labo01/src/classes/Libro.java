package classes;

public class Libro {
    String id;
    String nombre;
    String autor;
    int anio;
    String genero;
    boolean prestado;

    public Libro (String id, String nombre, String autor, int anio, String genero, boolean prestado){
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
        this.anio = anio;
        this.genero = genero;
        this.prestado = prestado;
    }

    public boolean estaDisponible(){
        return !prestado;
    }

    public void cambiarEstado(){
        this.prestado = this.!prestado;
    }

    public String getEstado(){
        return prestado;
    }

    // Mostrar resultados de libro
    public void mostrar_libro_convencional() {
        System.out.println("Identificación: " + this.id);
        System.out.println("Nombre del Libro: " + this.nombre);
        System.out.println("Autor: " + this.autor);
        System.out.println("Año de publicación: " + this.anio);
        System.out.println("Género: " + this.genero);
    }
}