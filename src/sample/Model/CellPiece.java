package sample.Model;

/**
 * Created by Mathieu on 03/03/2017.
 */
public class CellPiece {

    private Piece piece;

    public Cell (){
        this.piece = null;
    }

    public Cell (Piece piece){
        this.piece = piece;
    }



    public void takePiece(){
        this.piece = null;
    }

    public void putPiece(Piece piece){

        if(this.piece != null){
            System.out.println("Current cell was already taken by another piece. Problems may result.");
        }

        this.piece = piece;
    }


    public boolean isEmpty(){
        return this.piece == null;
    }
}
