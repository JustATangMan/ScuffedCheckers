package checkers;

import static checkers.Constants.BOX_LENGTH;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Main extends JFrame{
    // instance vars


    // constructor
    public Main(){
        setTitle("Checkers");
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(new Dimension(BOX_LENGTH*9, BOX_LENGTH*9));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        GridPanel gp = new GridPanel();
        this.add(gp);
    }
    
    // main
    public static void main(String[] args){
        new Main();
        
    }
}