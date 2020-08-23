package codigo;

//ConcreteVisitor1
public class AtaquePistola implements Ataque{

    private static int ATAQUE_PISTOLA = 30;

    //VisitConcreteElementA
    @Override
    public void atacarA(Tanque unTanque) {
        //No afecta al tanque
    }

    //VisitConcreteElementB
    @Override
    public void atacarA(Soldado unSoldado) {
        unSoldado.quitarVida(ATAQUE_PISTOLA);
    }
}
