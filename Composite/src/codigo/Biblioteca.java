package codigo;

import codigo.composite.CriterioBusqueda;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> libros;

    public Biblioteca(){
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro unLibro){
        libros.add(unLibro);
    }

    public ArrayList<Libro> buscarPorCriterio(CriterioBusqueda criterio){
        ArrayList<Libro> librosQueCumplenCriterio = new ArrayList<>();
        for (Libro libro: libros) {
            if(criterio.evaluar(libro)){
                librosQueCumplenCriterio.add(libro);
            }
        }
        return librosQueCumplenCriterio;
    }
}
