package codigo;

public class Computadora {

    private String ramSegundaRanura;
    private String ramPrimerRanura;
    private String gpu;
    private String cpu;
    private String psu;

    public Computadora(){
        ramSegundaRanura = "";
        ramPrimerRanura = "";
        gpu = "";
        cpu = "";
        psu = "";
    }

    public void agregarRAMPrimerRanura(String ramPrimerRanura) {
        this.ramPrimerRanura = ramPrimerRanura;
    }

    public void agregarRAMSegundaRanura(String ramSegundaRanura) {
        this.ramSegundaRanura = ramSegundaRanura;
    }

    public void agregarGPU(String gpu) {
        this.gpu = gpu;
    }

    public void agregarCPU(String cpu) {
        this.cpu = cpu;
    }

    public void agregarPSU(String psu) {
        this.psu = psu;
    }

    public String mostrarInformacion(){
        return "CPU: " + cpu +
               "\nGPU: " + gpu +
               "\nRAM1: " + ramPrimerRanura +
               "\nRAM2: " + ramSegundaRanura +
               "\nPSU: " + psu;
    }
}
