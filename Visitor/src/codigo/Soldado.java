package codigo;

//concreteElementA
public class Soldado implements Unidad {

    private int vida;
    private static int VIDA_SOLDADO = 100;
    
    public Soldado(){
        vida = VIDA_SOLDADO;
    }
    
    //Accept
    @Override
    public void recibirAtaque(Ataque unAtaque) {
        unAtaque.atacarA(this);
    }

    //OperationA
    public void explotar() {
        System.out.println("BUM");
        vida = 0;

    }

    public void quitarVida(int ataquePistola) {
        vida -= ataquePistola;
    }

    @Override
    public int obtenerVida() {
        return vida;
    }
}
