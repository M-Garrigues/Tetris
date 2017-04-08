package sample.tetris.tetrisController;

import sample.tetris.TetrisBoard;

/**
 * Coded by Mathieu GARRIGUES on 01/04/2017.
 */
public class TetrisControler extends AbstractTetrisControler{


    public TetrisControler(){
        this.game = new TetrisBoard();
    }



    public void getAction(TetrisAction action){

        if(!game.isPaused()){

            switch(action){

                case PAUSE:
                    game.pause();
                    break;

                case RESTART:
                    game.reset();
                    break;

                case GODOWN:
                    game.tickDown();
                    break;

                case ROTRIGHT:
                    game.rotRight();
                    break;

                case ROTLEFT:
                    game.rotLeft();
                    break;
            }
        }else if(action == TetrisAction.PAUSE){
            game.unPause();
        }

    }

    private void reset(){}

    private void pause(){}

    private void rotRight(){}

    private void rotLeft(){}

    private void goDown(){}
}
