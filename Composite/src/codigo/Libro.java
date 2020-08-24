package codigo;

public class Libro {

    private String nombre;
    private int cantidadPaginas;
    private String genero;

    public Libro(String nombre, int cantiadPaginas, String genero){
        this.nombre = nombre;
        this.cantidadPaginas = cantiadPaginas;
        this.genero = genero;
    }

    public int obtenerCantidadPaginas() {
        return cantidadPaginas;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerGenero() {
        return genero;
    }
}
