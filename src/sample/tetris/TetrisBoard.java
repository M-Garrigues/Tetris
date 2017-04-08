package sample.tetris;

import sample.boardGameLib.model.Grid;
import sample.boardGameLib.model.Position;
import sample.tetris.pieces.TetrisPiece;

import java.util.ArrayList;
import java.util.Collections;

import static sample.boardGameLib.model.Grid.Direction.DOWN;
import static sample.boardGameLib.model.Grid.Direction.LEFT;
import static sample.boardGameLib.model.Grid.Direction.RIGHT;
import static sample.tetris.pieces.PieceGenerator.nextRandPiece;
import static sample.tetris.pieces.PieceGenerator.randomPiece;

/**
 * Coded by Mathieu GARRIGUES on 24/03/2017.
 */

public class TetrisBoard extends Grid{

    private int points = 0;
    private int level;

    private boolean over;
    private boolean paused;

    private TetrisPiece currentPiece;
    private TetrisPiece nextPiece;

    public TetrisBoard(){
        super(25, 10);
        over = false;
        currentPiece = randomPiece();
        nextPiece = nextRandPiece(currentPiece);
    }





    public boolean tickDown(){
        move(currentPiece, DOWN);

        if(testPieceEnd(currentPiece)) { //the piece is now blocked
            lockPiece();                //we end its existence here, and create a new one;
            return true;
        }
        else return false;
    }





    public boolean testPieceEnd(TetrisPiece piece){
        if(blocked(piece)){
            checkLines(piece);
            return true;
        }
        else{return false;}
    }


    private boolean blocked(TetrisPiece piece){
        if(fits(piece, DOWN)) return false;
        else return true;
    }


    private void checkLines(TetrisPiece piece){
        ArrayList<Integer> listY = new ArrayList<>();
        int y;

        for (Position pos: piece.getShape()) {
            y = pos.getY();
            if(!listY.contains(y)){
                listY.add(y);
            }
        }

        Collections.sort(listY, Collections.reverseOrder());

        for(int line : listY){
            if(isFull(line)){
                emptyLine(line);
            }
        }
    }


    public void tickDown(int y){
        for(int i = y; y > 1; i++){
            for(int x = 0; x < getSizeX(); x++)
                getTabCell()[x][i] = getTabCell()[x][i+1]; //takes the cell above on the grid for each line superior to the line deleted.
        }
    }

    public void lockPiece(){
        currentPiece = nextPiece;
        nextPiece = nextRandPiece(currentPiece);
    }

    public void emptyLine(int y){
        for(int i = 0; i < getSizeX(); i++){
            getTabCell()[i][y].empty(); //suppresses the logical possession of the cell.
        }
        //will need to tick down every piece higher than this line.

        this.points += 200;
        notifyObservers();
    }


    public boolean isFull(int y){

        boolean check = true;

        for(int i = 0; i < getSizeX(); i++){
            if(getTabCell()[i][y].isEmpty()) check = false;
        }

        return check;
    }

    public void rotRight(){
        rotate(currentPiece, RIGHT);
    }

    public void rotLeft(){
        rotate(currentPiece, LEFT);
    }


    public void pause(){
        this.paused = true;
    }

    public void unPause(){
        this.paused = false;
    }

    public boolean isPaused(){
        return this.paused;
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


