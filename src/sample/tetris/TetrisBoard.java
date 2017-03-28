package sample.tetris;

import sample.boardGameLib.model.Grid;
import sample.boardGameLib.model.Position;
import sample.tetris.pieces.TetrisPiece;

import static sample.tetris.pieces.PieceGenerator.nextRandPiece;
import static sample.tetris.pieces.PieceGenerator.randomPiece;

/**
 * Coded by Mathieu GARRIGUES on 24/03/2017.
 */

public class TetrisBoard extends Grid{

    int points = 0;
    int level;

    boolean over;

    TetrisPiece currentPiece;
    TetrisPiece nextPiece;

    public TetrisBoard(){
        super(25, 10);
        over = false;
        currentPiece = randomPiece();
        nextPiece = nextRandPiece(currentPiece);
    }


    public void tickDown(){
        if(fits(currentPiece, Direction.DOWN)){
            move(currentPiece, Direction.DOWN);
        }
        else{
            lockPiece();
        }
    }

    public void lockPiece(){

        currentPiece = nextPiece;
        nextPiece = nextRandPiece(currentPiece);
    }

    public void emptyLine(int y){
        for(int i = 0; i < getSizeX(); i++){
            getTabCell()[i][y].getPiece().getShape().remove(new Position(i, y)); //deletes the cube a piece have on this line
            getTabCell()[i][y].empty(); //suppresses the logical possession of the cell.
        }

        //will need to tick down every piece higher than this line.

        this.points += 200;

        notifyObservers();
    }

    public boolean isFinished(){

        boolean test = false;
        for(int i = 0; i < getSizeX(); i++){
            if(getTabCell()[i][2].isTaken()) test = true; // Checks if the first line is reached by the stack. Id is 2 because there are 2 hidden lines
        }

        return test;
    }

    public void reset(){
        for(int i = 0; i < getSizeX(); i++){
            for(int j = 0; j < getSizeY(); j++){
                getTabCell()[i][j].empty();
            }
        }

        points = 0;
        over = false;

        currentPiece = randomPiece();
        nextPiece = nextRandPiece(currentPiece);
    }
}


