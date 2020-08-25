import codigo.Computadora;
import codigo.ConstructorGamer;
import codigo.ConstructorOficina;
import codigo.TiendaComputadoras;


public class EjemploBuilder {


    public void CreoUnaComputadoraGamerUsandoElDirectorYElConstructor(){
        ConstructorGamer constructor = new ConstructorGamer();
        TiendaComputadoras director = new TiendaComputadoras(constructor);
        director.construir();
        Computadora computadora = constructor.obtenerComputadora();
        System.out.println(computadora.mostrarInformacion());
    }

    public void CreoUnaComputadoraDeOficinaUsandoElDirectorYElConstructor(){
        ConstructorOficina constructor = new ConstructorOficina();
        TiendaComputadoras director = new TiendaComputadoras(constructor);
        director.construir();
        Computadora computadora = constructor.obtenerComputadora();
        System.out.println(computadora.mostrarInformacion());
    }

}
