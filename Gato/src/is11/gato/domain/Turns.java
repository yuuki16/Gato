package is11.gato.domain;

import is11.gato.domain.AI;
import is11.gato.domain.Player;

/**
 *
 * @author Michelle
 */
public class Turns {
   
    private int turn;
    private AI ai;
    private Player player;

    public Turns() {
        this.turn=2;
    }
    
    public void changeTurn(){
        if (turn==ai.getFicha()) {
            turn=2;
        }else {
            turn=1;
        }
    }//change
    
    public int getTurn(){
        return turn;
    }
    
    public void setSqr(int i, int j){
        if (turn==1) {
            ai.setSqr(i, j, 1);
        }else{
            ai.setSqr(i, j, 2);
        }
    }
    
}//
