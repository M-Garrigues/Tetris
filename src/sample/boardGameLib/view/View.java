package sample.boardGameLib.view;

import sample.Controler;
import sample.boardGameLib.model.Piece;
import sample.observer.Observer;

import javax.swing.*;

/**
 * Created by Florian on 26/03/2017.
 */
public class View extends JFrame implements Observer {

    private JPanel container = new JPanel();
    private Controler controler;

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
