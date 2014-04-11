package is11.gato.domain;

/**
 *
 * @author Michelle
 */
public class Nodo {
    
    Nodo[] movimientos;
    private AI grid;
    private int[][] posicion;
    private Turns turn;

    public Nodo() {
        
    }

    public AI getGrid() {
        return grid;
    }

    public Nodo[] getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(Nodo[] movimientos) {
        this.movimientos = movimientos;
    }
    
    
    
}//
