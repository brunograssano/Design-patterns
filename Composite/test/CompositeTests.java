import codigo.Biblioteca;
import codigo.Libro;
import codigo.composite.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompositeTests {

    private Biblioteca biblioteca;
    private ArrayList<Libro> resultadoBusqueda;

    @BeforeEach
    public void setUp(){
        biblioteca = new Biblioteca();
        biblioteca.agregarLibro(new Libro("Las aventuras de Sherlock Holmes",342,"Novela policíaca"));
        biblioteca.agregarLibro(new Libro("La espada del destino",254,"Novela fantastica"));
        biblioteca.agregarLibro(new Libro("Juego de tronos",832,"Novela fantastica"));
        biblioteca.agregarLibro(new Libro("Tormenta de espadas",1232,"Novela fantastica"));
        biblioteca.agregarLibro(new Libro("Educated",352,"Memoria"));
    }

    @Test
    public void test01CreoUnCriterioDeNombreBuscoYDeberiaDeObtenerUnResultado(){
        CriterioBusqueda criterio = new CriterioPorNombre("Educated");
        resultadoBusqueda = biblioteca.buscarPorCriterio(criterio);
        assertEquals(1, resultadoBusqueda.size());
    }

    @Test
    public void test02CreoUnCriterioDeGeneroBuscoYDeberiaDeObtenerTresResultados(){
        CriterioBusqueda criterio = new CriterioPorGenero("Novela fantastica");
        resultadoBusqueda = biblioteca.buscarPorCriterio(criterio);
        assertEquals(3, resultadoBusqueda.size());
    }

    @Test
    public void test03CreoUnCriterioDeCantidadMaximaDePaginasYDeberiaObtenerTresResultados(){
        CriterioBusqueda criterio = new CriterioPorCantidadMaximaPaginas(400);
        resultadoBusqueda = biblioteca.buscarPorCriterio(criterio);
        assertEquals(3, resultadoBusqueda.size());
    }

    @Test
    public void test04CreoUnCriterioCompuestoYDeberiaObtenerDosResultados(){
        CriterioBusqueda criterio1 = new CriterioPorCantidadMaximaPaginas(900);
        CriterioBusqueda criterio2 = new CriterioPorGenero("Novela fantastica");
        ArrayList<CriterioBusqueda> criterios = new ArrayList<>();
        criterios.add(criterio1);
        criterios.add(criterio2);

        CriterioBusqueda criteriosBusqueda = new CriterioCompuesto(criterios);

        resultadoBusqueda = biblioteca.buscarPorCriterio(criteriosBusqueda);
        assertEquals(2, resultadoBusqueda.size());
    }

}
