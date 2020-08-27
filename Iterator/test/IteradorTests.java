import codigo.Biblioteca;
import codigo.Iterador;
import codigo.IteradorFueraDeLosLimites;
import codigo.Libro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IteradorTests {


    @Test
    public void test01CreoUnaBibliotecaSinLibrosPreguntoSiTieneSiguienteDevuelveFalse(){
        Biblioteca biblioteca = new Biblioteca();
        Iterador iterador = biblioteca.obtenerIterador();
        assertFalse(iterador.tieneSiguiente());
    }

    @Test
    public void test02CreoUnaBibliotecaSinLibrosPidoActualLanzaExcepcion(){
        Biblioteca biblioteca = new Biblioteca();
        Iterador iterador = biblioteca.obtenerIterador();
        assertThrows(IteradorFueraDeLosLimites.class,
                iterador::libroActual);
    }

    @Test
    public void test03CreoUnaBibliotecaConLibrosPreguntoSiTieneSiguienteDevuelveTrue(){
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(new Libro("UnLibro"));
        biblioteca.agregarLibro(new Libro("OtroLibro"));
        Iterador iterador = biblioteca.obtenerIterador();
        assertTrue(iterador.tieneSiguiente());
    }

    @Test
    public void test04CreoUnaBibliotecaConLibrosPidoActualYDevuelveElPrimero(){
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(new Libro("UnLibro"));
        biblioteca.agregarLibro(new Libro("OtroLibro"));

        Iterador iterador = biblioteca.obtenerIterador();
        Libro unLibro = iterador.libroActual();
        assertEquals("UnLibro", unLibro.obtenerTitulo());
    }

    @Test
    public void test05CreoUnaBibliotecaConLibrosAvanzoAlSiguienteLoPidoYDevuelveElSegundo(){
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(new Libro("UnLibro"));
        biblioteca.agregarLibro(new Libro("OtroLibro"));

        Iterador iterador = biblioteca.obtenerIterador();
        iterador.siguiente();
        Libro unLibro = iterador.libroActual();
        assertEquals("OtroLibro", unLibro.obtenerTitulo());
    }


}
