package codigo;

//ConcreteBuilder
public class ConstructorGamer implements ConstructorComputadoras{

    private Computadora computadora;

    public ConstructorGamer(){
        computadora = new Computadora();
    }

    @Override
    public void agregarCPU() {
        computadora.agregarCPU("X1500 3.4GHz");
    }

    @Override
    public void agregarGPU() {
        computadora.agregarGPU("R423");
    }

    @Override
    public void agregarRAM() {
        computadora.agregarRAMPrimerRanura("8gb");
        computadora.agregarRAMSegundaRanura("8gb");
    }

    @Override
    public void agregarPSU() {
        computadora.agregarPSU("WE 600W 80p");
    }


    public Computadora obtenerComputadora() {
        return computadora;
    }
}
