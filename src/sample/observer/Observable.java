package sample.observer;

import sample.boardGameLib.model.Piece;

/**
 * Coded by Mathieu GARRIGUES on 24/03/2017.
 */
public interface Observable {

    public void addObserver(Observer obs);

    public void removeObserver();

    public void notifyObserversPiece(Piece piece);

    public void notifyObservers();

}