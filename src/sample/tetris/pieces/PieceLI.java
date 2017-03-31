package sample.tetris.pieces;

import sample.boardGameLib.model.Cell;
import sample.boardGameLib.model.Position;

/**
 * Coded by Mathieu GARRIGUES on 26/03/2017.
 */
public class PieceLI extends TetrisPiece{

    public PieceLI(){

        super(1, 4);

        this.getShape().add(new Position(0,3));
        this.getShape().add(new Position(1,3));
        this.getShape().add(new Position(1,5));

        this.color = Cell.Color.ORANGE;
    }
}
