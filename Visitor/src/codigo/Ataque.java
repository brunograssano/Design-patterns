package codigo;

//Visitor
public interface Ataque {

    void atacarA(Tanque unTanque);//VisitConcreteElementA

    void atacarA(Soldado unSoldado);//VisitConcreteElementB

}
