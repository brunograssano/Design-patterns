package codigo.composite;

import codigo.Libro;

public class CriterioPorGenero  implements CriterioBusqueda{
    private String generoBusqueda;

    public CriterioPorGenero(String genero){
        generoBusqueda = genero;
    }

    @Override
    public boolean evaluar(Libro unLibro) {
        return generoBusqueda.equals(unLibro.obtenerGenero());
    }
}
