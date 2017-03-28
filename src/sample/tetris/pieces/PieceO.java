package sample.tetris.pieces;

import sample.boardGameLib.model.Position;

/**
 * Coded by Mathieu GARRIGUES on 26/03/2017.
 */
public class PieceO extends TetrisPiece{

    public PieceO(){

        super(0, 4); //sets the center

        this.getShape().add(new Position(0,5));
        this.getShape().add(new Position(1,4));
        this.getShape().add(new Position(1,5));

        this.color = Color.GREEN;
    }
}