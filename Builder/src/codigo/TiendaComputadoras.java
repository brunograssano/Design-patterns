package codigo;

public class TiendaComputadoras {

    private ConstructorComputadoras constructor;

    public TiendaComputadoras(ConstructorComputadoras constructor){
        this.constructor = constructor;
    }

    public void construir(){
        constructor.agregarCPU();
        constructor.agregarGPU();
        constructor.agregarRAM();
        constructor.agregarPSU();
    }

}
