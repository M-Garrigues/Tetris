package sample.boardGameLib.model;

/**
 * Coded by Mathieu GARRIGUES on 24/03/2017.
 */


import sample.observer.Observable;
import sample.observer.Observer;

import java.util.ArrayList;


/**
 * Created by Mathieu on 03/03/2017.
 */

public abstract class AbstractGrid implements Observable {

    private Cell[][] tabCell;

    public Cell[][] getTabCell() {
        return tabCell;
    }

    public void setTabCell(Cell[][] tabCell) {
        this.tabCell = tabCell;
    }

    private int sizeX;
    private int sizeY;

    private ArrayList<Observer> listObserver = new ArrayList<Observer>();



    public AbstractGrid(int x, int y){
        sizeX = x;
        sizeY = y;

        tabCell = new Cell[x][y];
    }




    public Cell getCell(Position position){
        return tabCell[position.getX()][position.getY()];
    }


    public int getSizeX() {
        return sizeX;
    }

    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }



    public void addObserver(Observer obs) {
        this.listObserver.add(obs);
    }


    public void notifyObserversPiece(Piece piece) {

        for(Observer obs : listObserver)
            obs.updatePiece(piece);
    }

    public void notifyObservers() {

        for(Observer obs : listObserver)
            obs.update();
    }


    public void removeObserver() {
        listObserver = new ArrayList<Observer>();
    }


}
