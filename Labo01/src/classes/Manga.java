package classes;

public class Manga extends Libro {
    String estiloDibujo;
    String ambientacion;

    public Manga(String id, String nombre, String autor, Integer anio, String genero, String estiloDibujo, String ambientacion){
        super(id, nombre, autor, anio, genero);
        this.estiloDibujo = estiloDibujo;
        this.ambientacion = ambientacion;
    }

    // Mostrar lista de mangas
    public void mostrar_mangas() {
        System.out.println("Identificación: " + this.id);
        System.out.println("Nombre del manga: " + this.nombre);
        System.out.println("Autor: " + this.autor);
        System.out.println("Año de publicación: " + this.anio);
        System.out.println("Estilo de dibujo: " + this.estiloDibujo);
        System.out.println("Género: " + this.genero);
        System.out.println("Ambientado: " + this.ambientacion);
    }
}