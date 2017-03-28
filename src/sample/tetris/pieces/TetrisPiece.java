package sample.tetris.pieces;

import sample.boardGameLib.model.Piece;

/**
 * Coded by Mathieu GARRIGUES on 26/03/2017.
 */
public class TetrisPiece extends Piece {

    Color color;

    public TetrisPiece(int x, int y){
        super(x,y);


    }

    public enum Color{
        RED, BLUE, GREEN, YELLOW, ORANGE, PURPLE, LIGHTBLUE
    }

}
