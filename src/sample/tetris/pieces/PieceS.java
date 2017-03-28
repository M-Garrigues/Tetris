package sample.tetris.pieces;

import sample.boardGameLib.model.Position;

/**
 * Coded by Mathieu GARRIGUES on 26/03/2017.
 */
public class PieceS extends TetrisPiece{

    public PieceS(){

        super(0, 5);

        this.getShape().add(new Position(1,4));
        this.getShape().add(new Position(1,5));
        this.getShape().add(new Position(0,6));

        this.color = Color.YELLOW;
    }
}