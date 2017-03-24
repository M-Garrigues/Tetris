package sample.observer;

import sample.boardGameLib.model.Piece;

/**
 * Coded by Mathieu GARRIGUES on 24/03/2017.
 */

// These Observer/Observable interfaces are quite particular to board games, don't use anywhere else as is.


public interface Observable {

    public void addObserver(Observer obs);

    public void removeObserver();

    public void notifyObserversPiece(Piece piece);

    public void notifyObservers();

}