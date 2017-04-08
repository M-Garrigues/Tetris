package sample.tetris.tetrisController;

import sample.tetris.TetrisBoard;

/**
 * Coded by Mathieu GARRIGUES on 01/04/2017.
 */
public abstract class AbstractTetrisControler {

    public enum TetrisAction{
        PAUSE, MENU, RESTART, ROTLEFT, ROTRIGHT, GODOWN
    }

    protected TetrisBoard game;

    public AbstractTetrisControler(TetrisBoard grid){
        this.game = grid;
    }

    public void getAction(TetrisAction action){}

    private void reset(){}

    private void pause(){}

    private void rotRight(){}

    private void rotLeft(){}

    private void goDown(){}




    public AbstractTetrisControler(){
        this.game = new TetrisBoard();
    }
}
