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
}