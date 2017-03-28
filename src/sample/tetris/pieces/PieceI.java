package sample.tetris;

import sample.boardGameLib.model.Position;

/**
 * Coded by Mathieu GARRIGUES on 28/03/2017.
 */
public class PieceI extends TetrisPiece{

    public PieceI(){
        super(1, 4);

        this.getShape().add(new Position(1,3));
        this.getShape().add(new Position(1,5));
        this.getShape().add(new Position(1,6));
        this.getShape().add(new Position(1,7));
    }
}
