package sample.boardGameLib.model;

import static sample.boardGameLib.model.Cell.Color.TRANSPARENT;


/**
 * Created by Mathieu on 03/03/2017.
 */
public class Cell {

    private boolean taken;
    private Piece piece;
    protected Color color;


    public enum Color{
        RED, BLUE, GREEN, YELLOW, ORANGE, PURPLE, LIGHTBLUE, TRANSPARENT
    }


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

    public Color getColor(){
        return this.color;
    }
}
