package sample.tetris.pieces;

import sample.boardGameLib.model.Cell;
import sample.boardGameLib.model.Position;

/**
 * Coded by Mathieu GARRIGUES on 26/03/2017.
 */

public class PieceT extends TetrisPiece{

    public PieceT(){

        super(0, 5);

        this.getShape().add(new Position(0,4));
        this.getShape().add(new Position(1,5));
        this.getShape().add(new Position(0,6));

        this.color = Cell.Color.PURPLE;
    }
}