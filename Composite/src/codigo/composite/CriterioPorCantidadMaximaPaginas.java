package codigo.composite;

import codigo.Libro;

public class CriterioPorCantidadMaximaPaginas implements CriterioBusqueda{

    private int cantidadMaximaDePaginas;

    public CriterioPorCantidadMaximaPaginas(int cantidadMaximaDePaginas){
        this.cantidadMaximaDePaginas = cantidadMaximaDePaginas;
    }
    @Override
    public boolean evaluar(Libro unLibro) {
        return unLibro.obtenerCantidadPaginas()<= cantidadMaximaDePaginas;
    }
}
