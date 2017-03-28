package sample.boardGameLib.model;

/**
 * Created by Mathieu on 03/03/2017.
 */
public class Cell {

    private boolean taken;
    Piece piece;

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
        }
        else{
            this.piece = null;
        }
    }

    public void empty(){
        this.taken = false;
        this.piece = null;}

    public boolean isEmpty(){
        return !this.taken;
    }

    public boolean isTaken() { return this.taken;}

    public Piece getPiece(){return this.piece;}
}
