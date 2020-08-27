package codigo;

import java.util.ArrayList;

public class IteradorBiblioteca implements Iterador{

    private ArrayList<Libro> libros;
    private Integer actual;

    public IteradorBiblioteca(ArrayList<Libro> libros) {
        actual = 0;
        this.libros = new ArrayList<>(libros);
    }

    @Override
    public boolean tieneSiguiente() {
        return libros.size()>actual;
    }

    @Override
    public Libro libroActual() {
        if(tieneSiguiente()){
            return libros.get(actual);
        }
        throw new IteradorFueraDeLosLimites();
    }

    @Override
    public void siguiente() {
        actual++;
    }
}
