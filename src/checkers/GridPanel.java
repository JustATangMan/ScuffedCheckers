package checkers;

import static checkers.Constants.BOX_LENGTH;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JPanel;

public class GridPanel extends JPanel{

    MouseAdapter ma;
    ArrayList<Piece> pieces = new ArrayList<>();

    public GridPanel(){
        // constructor
        pieceInit();
        ma = new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println("Click");
                int mouseX = e.getX();
                int mouseY = e.getY();
                System.out.println("Pressed: [X: " + mouseX/BOX_LENGTH + "], [Y: " + mouseY/BOX_LENGTH + "]");
            }
        };
        addMouseListener(ma);
    }

    @Override
    public void paint(Graphics g){
        // paint the grid
        for(int x = 0; x < 8; x++){
            for(int y = 0; y < 8; y++){
                if((x+y) % 2 == 1){
                    g.setColor(Color.black);
                }else{
                    g.setColor(Color.white);
                }

                g.fillRect(x*BOX_LENGTH, y*BOX_LENGTH, BOX_LENGTH, BOX_LENGTH);
            }
        }

        paintPieces(g);
    }

    public void pieceInit(){
        // place down initial pieces in starting state (hardcoded)
        pieces.add(new StrdPiece(0, 7, 0));
        pieces.add(new StrdPiece(1, 6, 1));
    }

    public boolean checkPiece(int x, int y, int team){
        //check if piece exists in the ArrayList of Pieces.

    }

    public void paintPieces(Graphics g){
        // call whenever piece positions are modified to update the GUI
        for(int i = 0; i < pieces.size(); i++){
            if(pieces.get(i).getTeam() == 0){
                g.setColor(Color.orange);
            }else{
                g.setColor(Color.cyan);
            }
            g.fillOval(pieces.get(i).getX()*BOX_LENGTH, pieces.get(i).getY()*BOX_LENGTH, BOX_LENGTH, BOX_LENGTH);
        }
    }

    

    public byte checkMoves(Piece p){
        // check possible moves that a piece that is clicked can do.

    }

}