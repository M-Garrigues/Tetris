package sample.tetris.pieces;

import sample.boardGameLib.model.Position;

/**
 * Coded by Mathieu GARRIGUES on 26/03/2017.
 */
public class PieceZ extends TetrisPiece{

    public PieceZ(){

        super(1, 5);

        this.getShape().add(new Position(0,4));
        this.getShape().add(new Position(0,5));
        this.getShape().add(new Position(1,6));

        this.color = Color.LIGHTBLUE;
    }
}
