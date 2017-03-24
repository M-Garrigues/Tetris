package sample.boardGameLib.model;

import org.jetbrains.annotations.Contract;

import java.util.ArrayList;

/**
 * Coded by Mathieu GARRIGUES on 07/03/2017.
 */
public class Grid extends AbstractGrid{

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
        notifyObserversPiece(piece);
    }


    public boolean fits(Piece piece){
        boolean fits = true;
        for (Position pos : piece.getShape()) {
            if(grid.getCell(pos).isTaken()) fits = false;
        }

        return fits;
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

        notifyObserversPiece(piece);
    }


    public void emptyLine(int y){
        for(int i = 0; i < grid.getSizeX(); i++){
            grid.getTabCell()[i][y].empty();
        }

        notifyObservers();
    }


    public boolean reverse(Piece piece){
        Piece testPiece = new Piece(piece);

        boolean check = true;

        int xCenter = testPiece.getCenter().getX();
        int yCenter = testPiece.getCenter().getY();

        int xTest;
        int yTest;

        int yDiff;
        int xDiff;

        int xNew;
        int yNew;

        for(Position pos: testPiece.getShape()){
            xTest = pos.getX();
            yTest = pos.getY();

            xDiff = xTest - xCenter;
            yDiff = yTest - yCenter;

            xNew = xCenter - xDiff;
            yNew = yCenter - yDiff;

            if(xNew < 0 || xNew > getSizeX() -1 || yNew < 0 || yNew > getSizeY() - 1 ){
                check = false;
            }

            pos.setX(xNew);
            pos.setY(yNew);
        }


        if(fits(testPiece) && check){
            piece = testPiece;
            return true;
        }
        else{
            return false;
        }
    }


    public boolean rotateRight(Piece piece){
        Piece testPiece = new Piece(piece);

        boolean check = true;

        int xCenter = testPiece.getCenter().getX();
        int yCenter = testPiece.getCenter().getY();

        int xTest;
        int yTest;

        int yDiff;
        int xDiff;

        int xNew;
        int yNew;

        for(Position pos: testPiece.getShape()){
            xTest = pos.getX();
            yTest = pos.getY();

            xDiff = xTest - xCenter;
            yDiff = yTest - yCenter;

            xNew = xCenter + yDiff;
            yNew = yCenter - xDiff;

            if(xNew < 0 || xNew > getSizeX() -1 || yNew < 0 || yNew > getSizeY() - 1 ){
                check = false;
            }

            pos.setX(xNew);
            pos.setY(yNew);
        }


        if(fits(testPiece) && check){
            piece = testPiece;
            return true;
        }
        else{
            return false;
        }
    }


    public boolean rotateLeft(Piece piece){
        Piece testPiece = new Piece(piece);

        boolean check = true;

        int xCenter = testPiece.getCenter().getX();
        int yCenter = testPiece.getCenter().getY();

        int xTest;
        int yTest;

        int yDiff;
        int xDiff;

        int xNew;
        int yNew;

        for(Position pos: testPiece.getShape()){
            xTest = pos.getX();
            yTest = pos.getY();

            xDiff = xTest - xCenter;
            yDiff = yTest - yCenter;

            xNew = xCenter - yDiff;
            yNew = yCenter + xDiff;

            if(xNew < 0 || xNew > getSizeX() -1 || yNew < 0 || yNew > getSizeY() - 1 ){
                check = false;
            }

            pos.setX(xNew);
            pos.setY(yNew);
        }


        if(fits(testPiece) && check){
            piece = testPiece;
            return true;
        }
        else{
            return false;
        }
    }
































    public Grid() {
    }

    public Grid(Grid grid, ArrayList<Piece> pieces) {
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
