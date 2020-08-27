package codigo;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> libros;

    public Biblioteca(){
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro unLibro){
        libros.add(unLibro);
    }

    public Iterador obtenerIterador(){
        return new IteradorBiblioteca(libros);
    }
}
