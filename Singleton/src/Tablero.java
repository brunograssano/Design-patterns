public class Tablero{

    private static Tablero tablero = null;
    private static int MAX_PIEZAS = 10;

    private char[][] piezas;

    private Tablero(){
        piezas = new char[MAX_PIEZAS][MAX_PIEZAS];
    }

    public static Tablero getInstance(){
        if(tablero==null){
            tablero = new Tablero();
        }
        return tablero;
    }

    public void agregarPieza(char pieza,int i, int j) throws PiezaFueraDeRangoExcepcion{
        try{
            piezas[i][j] = pieza;
        }catch (IndexOutOfBoundsException e){
            throw new PiezaFueraDeRangoExcepcion();
        }
    }

    public char obtenerPieza(int i, int j) throws PiezaFueraDeRangoExcepcion{
        try{
            return piezas[i][j];
        }catch (IndexOutOfBoundsException e){
            throw new PiezaFueraDeRangoExcepcion();
        }
    }

}
