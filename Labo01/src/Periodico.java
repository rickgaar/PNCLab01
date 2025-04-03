class Periodico extends Libro{
    String estiloPapel;
    int numHojas;

    public Periodico(String id, String nombre, String autor, Integer anio, String genero, String estiloPapel, int numHojas){
        super(id, nombre, autor, anio, genero);
        this.estiloPapel = estiloPapel;
        this.numHojas = numHojas;
    }
}