package codigo;

//ConcreteVisitor2
public class Misil implements Ataque{

    private static int ATAQUE_MISIL = 200;

    //VisitConcreteElementA
    @Override
    public void atacarA(Tanque unTanque) {
        unTanque.quitarVida(ATAQUE_MISIL);
    }

    //VisitConcreteElementB
    @Override
    public void atacarA(Soldado unSoldado) {
        unSoldado.explotar();
    }
}
