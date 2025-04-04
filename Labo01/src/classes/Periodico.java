package classes;

public class Periodico extends Libro {
    String estiloPapel;
    int numHojas;

    public Periodico(String id, String nombre, String autor, Integer anio, String genero, String estiloPapel, int numHojas){
        super(id, nombre, autor, anio, genero, false);
        this.estiloPapel = estiloPapel;
        this.numHojas = numHojas;
    }

    public boolean isPrestado() {
        return this.prestado;
    }

    public String getIdentificador() {
        return this.id;
    }

    // Mostrar lista de periodicos
    public void mostrar_periodico() {
        System.out.println("Identificación: " + this.id);
        System.out.println("Titulo del periodico: " + this.nombre);
        System.out.println("Autor: " + this.autor);
        System.out.println("Año de publicación: " + this.anio);
        System.out.println("Estilo de papel: " + this.estiloPapel);
        System.out.println("Género: " + this.genero);
        System.out.println("Numero de hoja: " + this.numHojas);
    }
}