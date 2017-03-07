package sample.model;

/**
 * Created by Mathieu on 03/03/2017.
 */
public class Cell {

    private boolean taken;

    public Cell(){
        this.taken = false;
    }

    public Cell(boolean state){
        this.taken = state;
    }



    public void toggle(){
        this.taken = !this.taken;
    }

    public void empty(){ this.taken = false;}

    public boolean isEmpty(){
        return !this.taken;
    }

    public boolean isTaken() { return this.taken;}
}
