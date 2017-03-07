package sample.model;

/**
 * Created by Mathieu on 03/03/2017.
 */

public class Grid {

    private Cell[][] tabCell;
    private int sizeX;
    private int sizeY;


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

    public void emptyLine(int y){for(int i = 0; i < sizeX; i++){
            tabCell[i][y].empty();
        }
    }
}
