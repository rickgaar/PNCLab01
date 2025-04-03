package classes;

public class Manga extends Libro {
    String estiloDibujo;
    String ambientacion;

    public Manga(String id, String nombre, String autor, Integer anio, String genero, String estiloDibujo, String ambientacion){
        super(id, nombre, autor, anio, genero);
        this.estiloDibujo = estiloDibujo;
        this.ambientacion = ambientacion;
    }
}