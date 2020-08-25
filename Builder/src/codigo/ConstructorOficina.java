package codigo;

//ConcreteBuilder
public class ConstructorOficina implements ConstructorComputadoras{

    private Computadora computadora;

    public ConstructorOficina(){
        computadora = new Computadora();
    }

    @Override
    public void agregarCPU() {
        computadora.agregarCPU("Pa X4 2.6GHz");
    }

    @Override
    public void agregarGPU() {
    }

    @Override
    public void agregarRAM() {
        computadora.agregarRAMPrimerRanura("8gb");
    }

    @Override
    public void agregarPSU() {
        computadora.agregarPSU("MR 350W");
    }


    public Computadora obtenerComputadora() {
        return computadora;
    }
}

