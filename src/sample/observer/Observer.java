package sample.observer;

import sample.boardGameLib.model.Piece;

/**
 * Coded by Mathieu GARRIGUES on 24/03/2017.
 */

public interface Observer {
    public void updatePiece(Piece piece);
    public void update();
}
