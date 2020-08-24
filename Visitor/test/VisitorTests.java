import codigo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VisitorTests {

    @Test
    public void test01CreoUnAtaqueDeMisilLoMandoAUnSoldadoYSuVidaEsCero(){
        Unidad soldado = new Soldado();
        Misil unMisil = new Misil();

        soldado.recibirAtaque(unMisil);

        assertEquals(0,soldado.obtenerVida());
    }

    @Test
    public void test02CreoUnAtaqueDePistolaLoMandoAUnSoldadoYSuVidaEsSetenta(){
        Unidad soldado = new Soldado();
        AtaquePistola pistola = new AtaquePistola();

        soldado.recibirAtaque(pistola);

        assertEquals(70,soldado.obtenerVida());
    }

    @Test
    public void test03CreoUnAtaqueDePistolaLoMandoAUnTanqueYSuVidaSigueSiendoLaInicial(){
        Unidad tanque = new Tanque();
        AtaquePistola pistola = new AtaquePistola();

        int vidaInicial = tanque.obtenerVida();

        tanque.recibirAtaque(pistola);

        assertEquals(vidaInicial,tanque.obtenerVida());
    }

    @Test
    public void test04CreoUnMisilLoMandoAUnTanqueYSuVidaEs300(){
        Unidad tanque = new Tanque();
        Misil misil = new Misil();

        tanque.recibirAtaque(misil);

        assertEquals(300,tanque.obtenerVida());
    }

}
