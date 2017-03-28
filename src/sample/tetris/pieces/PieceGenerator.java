package sample.tetris.pieces;

import sample.boardGameLib.model.Piece;

/**
 * Coded by Mathieu GARRIGUES on 26/03/2017.
 */
public class PieceGenerator {

    public static TetrisPiece randomPiece(){
        int i = (int)(Math.random() * 7);
        TetrisPiece piece;
        switch (i) {

            case 0:
                piece = new PieceI();
                break;

            case 1:
                piece = new PieceL();
                break;

            case 2:
                piece = new PieceLI();
                break;

            case 3:
                piece = new PieceO();
                break;

            case 4:
                piece = new PieceS();
                break;

            case 5:
                piece = new PieceT();
                break;

            case 6:
                piece = new PieceZ();
                break;

            default:
                piece = new PieceI();
        }
        return piece;
    }

    public static TetrisPiece nextRandPiece(Piece piece){
        int i = (int)(Math.random() * 7);
        TetrisPiece newPiece;

        newPiece = randomPiece();

        if(newPiece.getClass() == piece.getClass()){newPiece = nextRandPiece(piece);} //if the piece is the same as the previous one, new rand gen

        return newPiece;
    }
}
