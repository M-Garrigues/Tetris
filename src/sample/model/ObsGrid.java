package sample.model;

import org.jetbrains.annotations.Contract;

import java.util.ArrayList;
import java.util.Observable;

/**
 * Coded by Mathieu GARRIGUES on 07/03/2017.
 */
public class ObsGrid extends Observable{

    private Grid grid;
    private ArrayList<Piece> pieces;


    private enum Direction{
        UP, DOWN, RIGHT, LEFT, NONE;

        @Contract("_ -> !null")
        public static Position up(Position pos){
            return new Position( pos.getX(), pos.getY() + 1);
        }

        @Contract("_ -> !null")
        public static Position down(Position pos){
            return new Position( pos.getX(), pos.getY() - 1);
        }

        @Contract("_ -> !null")
        public static Position right(Position pos){
            return new Position( pos.getX() + 1, pos.getY());
        }

        @Contract("_ -> !null")
        public static Position left (Position pos){
            return new Position( pos.getX() - 1, pos.getY());
        }
    }


    public void addPiece(Piece piece){

        // THIS FUNCTION NEEDS A FITS CALL BEFORE.

        pieces.add(piece);
        changed();
    }


    public void emptyLine(int y){
        for(int i = 0; i < grid.getSizeX(); i++){
        grid.getTabCell()[i][y].empty();
        }

        changed();
    }


    public boolean fits(Piece piece){
        boolean fits = true;
        for (Position pos : piece.getShape()) {
            if(grid.getCell(pos).isTaken()) fits = false;
        }

        return fits;
    }



    public void changed(){
        setChanged();
        notifyObservers();
    }



    public boolean fits(Piece piece, Direction dir){
        boolean fits = true;
        Position temp;

        switch (dir){

            case UP:

                for (Position pos : piece.getShape()) {
                    temp = Direction.up(pos);
                    if(grid.getCell(temp).isTaken() && !piece.getShape().contains(temp)) fits = false;
                }
                break;

            case DOWN:

                for (Position pos : piece.getShape()) {
                    temp = Direction.down(pos);
                    if(grid.getCell(temp).isTaken() && !piece.getShape().contains(temp)) fits = false;
                }
                break;

            case RIGHT:

                for (Position pos : piece.getShape()) {
                    temp = Direction.right(pos);
                    if(grid.getCell(temp).isTaken() && !piece.getShape().contains(temp)) fits = false;
                }
                break;

            case LEFT:

                for (Position pos : piece.getShape()) {
                    temp = Direction.left(pos);
                    if(grid.getCell(temp).isTaken() && !piece.getShape().contains(temp)) fits = false;
                }
                break;
        }


        return fits;
    }




    public void move(Piece piece, Direction dir){

        // THIS FUNCTION NEED THE FUNCTION FIT TO BE CALLED BEFORE IT

        switch (dir) {


            case UP:

                for (Position pos : piece.getShape()) {
                    pos.setY(pos.getY() + 1);
                }
                break;

            case DOWN:

                for (Position pos : piece.getShape()) {
                    pos.setY(pos.getY() - 1);
                }
                break;

            case RIGHT:

                for (Position pos : piece.getShape()) {
                    pos.setX(pos.getX() + 1);
                }
                break;

            case LEFT:

                for (Position pos : piece.getShape()) {
                    pos.setX(pos.getX() - 1);
                }
                break;

        }

        changed();
    }



































    public ObsGrid() {
    }

    public ObsGrid(Grid grid, ArrayList<Piece> pieces) {
        this.grid = grid;
        this.pieces = pieces;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }

    public Grid getGrid() {
        return grid;
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }
}