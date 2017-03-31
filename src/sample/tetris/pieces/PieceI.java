package sample.tetris.pieces;

import sample.boardGameLib.model.Cell;
import sample.boardGameLib.model.Position;

/**
 * Coded by Mathieu GARRIGUES on 26/03/2017.
 */
public class PieceI extends TetrisPiece{

    public PieceI(){
        super(1, 4);

        this.getShape().add(new Position(1,3));
        this.getShape().add(new Position(1,5));
        this.getShape().add(new Position(1,6));

        this.color = Cell.Color.BLUE;
    }
}
