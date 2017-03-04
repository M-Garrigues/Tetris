package sample.Model;

/**
 * Created by Mathieu on 03/03/2017.
 */
public class CellBool {

    private boolean taken;

    public CellBool (){
        this.taken = false;
    }

    public CellBool (boolean state){
        this.taken = state;
    }



    public void toggle(){
        this.taken = !this.taken;
    }

    public void putPiece(){

        if(this.piece != null){
            System.out.println("Current cell was already taken by another piece. Problems may result.");
        }

        this.piece = piece;
    }


    public boolean isEmpty(){
        return this.piece == null;
    }
}
