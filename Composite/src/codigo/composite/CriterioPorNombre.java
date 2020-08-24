package codigo.composite;

import codigo.Libro;

public class CriterioPorNombre  implements CriterioBusqueda{
    private String nombreBusqueda;

    public CriterioPorNombre(String nombre){
        nombreBusqueda = nombre;
    }

    @Override
    public boolean evaluar(Libro unLibro) {
        return nombreBusqueda.equals(unLibro.obtenerNombre());
    }
}
