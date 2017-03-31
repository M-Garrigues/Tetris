package sample.boardGameLib.model;

import sample.tetris.pieces.TetrisPiece;

import static sample.tetris.pieces.TetrisPiece.Color.*;

/**
 * Created by Mathieu on 03/03/2017.
 */
public class Cell {

    private boolean taken;
    private Piece piece;
    private TetrisPiece.Color color;

    public Cell(){
        this.taken = false;
    }

    public Cell(boolean state){
        this.taken = state;
    }



    public void toggle(Piece piece){
        this.taken = !this.taken;

        if(this.taken){
            this.piece = piece;
            this.color = piece.getColor();
        }
        else{
            this.piece = null;
            this.color = TRANSPARENT;
        }
    }

    public void empty(){
        this.taken = false;
        this.piece = null;
        this.color = TRANSPARENT;
    }

    public boolean isEmpty(){
        return !this.taken;
    }

    public boolean isTaken() { return this.taken;}

    public Piece getPiece(){return this.piece;}

    public TetrisPiece.Color getColor(){
        return this.color;
    }
}
