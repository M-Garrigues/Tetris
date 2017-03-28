package sample.tetris;

import sample.boardGameLib.model.Grid;
import sample.tetris.pieces.TetrisPiece;

/**
 * Coded by Mathieu GARRIGUES on 26/03/2017.
 */
public class TetrisBoard extends Grid{

    int points = 0;
    int level;
    TetrisPiece nextPiece;

    public TetrisBoard(){
        super(25, 10);
    }


    public void emptyLine(int y){
        for(int i = 0; i < getSizeX(); i++){
            getTabCell()[i][y].empty();
        }

        notifyObservers();
    }
}


