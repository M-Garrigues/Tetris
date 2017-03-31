package sample.boardGameLib.model;

import sample.boardGameLib.model.Cell.Color;

import java.util.ArrayList;

/**
 * Created by Mathieu on 07/03/2017.
 */
public class Piece {

    protected Position center;
    protected ArrayList<Position> shape;
    protected Color color;



    public Piece(){
        this.center = new Position(0,0);
        this.shape = new ArrayList<>();
    }


    public Piece(int x, int y) {
        this.center = new Position(x,y);
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
