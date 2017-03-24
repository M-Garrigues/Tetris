package sample.boardGameLib.model;

import java.util.ArrayList;

/**
 * Created by Mathieu on 07/03/2017.
 */
public class Piece {

    private Position center;
    private ArrayList<Position> shape;




    public Piece(Position center) {
        this.center = center;
        this.shape = new ArrayList<>();
    }


    public Piece (Piece piece){
        this.center = piece.center;
        this.shape = piece.shape;
    }

    public Position getCenter() {
        return center;
    }

    public void setCenter(Position center) {
        this.center = center;
    }

    public ArrayList<Position> getShape() {
        return shape;
    }

    public void setShape(ArrayList<Position> shape) {
        this.shape = shape;
    }
}
