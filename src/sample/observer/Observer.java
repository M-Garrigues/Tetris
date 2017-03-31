package sample.observer;

import sample.boardGameLib.model.Piece;

/**
 * Coded by Mathieu GARRIGUES on 24/03/2017.
 */

// These observer/Observable interfaces are quite particular to board games, don't use anywhere else as is.

public interface Observer {
    public void updatePiece(Piece piece);
    public void update();
}
