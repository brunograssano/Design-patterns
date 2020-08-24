package codigo.composite;

import codigo.Libro;

import java.util.ArrayList;

public class CriterioCompuesto implements CriterioBusqueda{

    private ArrayList<CriterioBusqueda> criteriosDeBusqueda;

    public CriterioCompuesto(ArrayList<CriterioBusqueda> criterios){
        criteriosDeBusqueda = criterios;
    }

    @Override
    public boolean evaluar(Libro unLibro) {
        boolean resultado = true;
        for (CriterioBusqueda criterio:criteriosDeBusqueda) {
            if(!criterio.evaluar(unLibro)){
              resultado = false;
            }
        }
        return resultado;
    }
}
