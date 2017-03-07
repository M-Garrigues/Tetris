package sample.BoardGameLib.model;

/**
 * Created by Mathieu on 03/03/2017.
 */

public class Grid {

    private Cell[][] tabCell;

    public Cell[][] getTabCell() {
        return tabCell;
    }

    public void setTabCell(Cell[][] tabCell) {
        this.tabCell = tabCell;
    }

    private int sizeX;
    private int sizeY;






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

    public Grid(){
        tabCell = new Cell[0][0];
        sizeX = 0;
        sizeY = 0;
    }

    public Grid(int x, int y){
        tabCell = new Cell[x][y];
        sizeX = x;
        sizeY = y;
    }


}
