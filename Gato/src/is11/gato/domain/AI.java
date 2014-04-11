package is11.gato.domain;

/**
 *
 * @author Michelle
 */
public class AI {
    
    private final int ficha=1;
    private int[][] grid;
    
    public AI() {
        grid= new int[3][3];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                grid[i][j]=0;
            }
        }
    }

    public int[][] getGrid() {
        return grid;
    }

    public int getFicha() {
        return ficha;
    }
    
    public int getSqr(int i, int j){
        return grid[i][j];
    }
    
    public void setSqr(int i, int j, int valor){
        if (getSqr(i, j)==0) {
            grid[i][j]= valor;
        }else{
            System.out.println("La casilla esta ocupada.");
        }
    }
    
    public int freeSqrs(){
        int sqrs=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j]==0) {
                    sqrs++;
                }
            }
        }
        return sqrs;
    }
}//AI
