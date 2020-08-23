package codigo;

//concreteElementB
public class Tanque implements Unidad {

    private int vida;
    private static int VIDA_TANQUE = 500;

    public Tanque(){
        vida = VIDA_TANQUE;
    }

    //Accept
    @Override
    public void recibirAtaque(Ataque unAtaque) {
        unAtaque.atacarA(this);
    }

    //OperationB
    public void quitarVida(int unAtaque) {
        vida-= unAtaque;
    }

    @Override
    public int obtenerVida() {
        return vida;
    }

}
