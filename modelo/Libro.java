package modelo;

public class Libro {

    //Atributos

    private String titulo;
    private String autor;
    private int edicion;
    private String coleccion;
    private String lujo;

    //Constructor
    public void libro(){
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getColeccion() {
        return coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }

    public String getLujo() {
        return lujo;
    }

    public void setLujo(String lujo) {
        this.lujo = lujo;
    }
    
}
