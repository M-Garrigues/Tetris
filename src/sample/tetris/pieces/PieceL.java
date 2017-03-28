package sample.tetris.pieces;

import sample.boardGameLib.model.Position;

/**
 * Coded by Mathieu GARRIGUES on 26/03/2017.
 */
public class PieceL extends TetrisPiece{

    public PieceL(){

        super(0, 4);

        this.getShape().add(new Position(0,3));
        this.getShape().add(new Position(1,3));
        this.getShape().add(new Position(0,5));

        this.color = Color.RED;
    }
}
