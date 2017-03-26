package sample.observer;

import sample.Controller;
import sample.boardGameLib.model.Piece;

import javax.swing.*;

/**
 * Created by Florian on 26/03/2017.
 */
public class View extends JFrame implements Observer {

    private JPanel container = new JPanel();
    private Controller controler;

    public View (){
        //Settings for JFrame
        this.setSize(300,300);
        this.setTitle("Tetris");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(container);
    }

    private void initDisplay (){

    }






    public void updatePiece(Piece piece){

    }
    public void update(){

    }
}
