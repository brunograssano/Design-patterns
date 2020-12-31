
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SingletonTests {

    @Test
    public void test01LlamoALaClaseYDevuelveUnObjetoDistintoDeNull(){
        Tablero tablero = Tablero.getInstance();
        assertNotEquals(null, tablero);
    }

    @Test
    public void test02PidoUnaPiezaYDevuelveCero(){
        Tablero tablero = Tablero.getInstance();
        assertEquals(0, tablero.obtenerPieza(4, 2));
    }

    @Test
    public void test03AgregoUnaPiezaLaPidoYLaDevuelve(){
        Tablero tablero = Tablero.getInstance();
        tablero.agregarPieza('O',2, 3);
        assertEquals('O', tablero.obtenerPieza(2, 3));
    }

    @Test
    public void test04MandoIndiceFueraDeRangoLanzaExcepcion(){
        Tablero tablero = Tablero.getInstance();
        assertThrows(PiezaFueraDeRangoExcepcion.class,
                ()->{
                    tablero.agregarPieza('O',1000000, 500);
                });
    }


}
