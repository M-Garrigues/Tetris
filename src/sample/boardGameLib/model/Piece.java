package sample.boardGameLib.model;

import sample.tetris.pieces.TetrisPiece;

import java.util.ArrayList;

/**
 * Created by Mathieu on 07/03/2017.
 */
public class Piece {

    private Position center;
    private ArrayList<Position> shape;
    private TetrisPiece.Color color;



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

    public TetrisPiece.Color getColor() {
        return color;
    }

    public void setColor(TetrisPiece.Color color) {
        this.color = color;
    }
}
