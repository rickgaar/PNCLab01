package classes;

public class Libro {
    String id;
    String nombre;
    String autor;
    int anio;
    String genero;

    public Libro (String id, String nombre, String autor, int anio, String genero){
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
        this.anio = anio;
        this.genero = genero;
    }
}