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
        pieces.add(new StrdPiece(2, 7, 0));
        pieces.add(new StrdPiece(3, 6, 0));
        pieces.add(new StrdPiece(4, 7, 0));
        pieces.add(new StrdPiece(5, 6, 0));
        pieces.add(new StrdPiece(6, 7, 0));
        pieces.add(new StrdPiece(0, 5, 0));
        pieces.add(new StrdPiece(2, 5, 0));
        pieces.add(new StrdPiece(4, 5, 0));
        pieces.add(new StrdPiece(7, 6, 0));
        pieces.add(new StrdPiece(1, 6, 0));
        pieces.add(new StrdPiece(6, 5, 0));
        // yellow
        pieces.add(new StrdPiece(0, 1, 1));
        pieces.add(new StrdPiece(1, 0, 1));
        pieces.add(new StrdPiece(1, 2, 1));
        pieces.add(new StrdPiece(2, 1, 1));
        pieces.add(new StrdPiece(3, 0, 1));
        pieces.add(new StrdPiece(3, 2, 1));
        pieces.add(new StrdPiece(4, 1, 1));
        pieces.add(new StrdPiece(5, 0, 1));
        pieces.add(new StrdPiece(6, 1, 1));
        pieces.add(new StrdPiece(7, 0, 1));
        pieces.add(new StrdPiece(7, 2, 1));
        pieces.add(new StrdPiece(5, 2, 1));
    }

    public void checkPiece(int x, int y, int team) {
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

 //
    public void checkMoves(Piece p) {
        // check possible moves that a piece that is clicked can do.
        int row, column, currentPlayer;
        int selectedRow, selectedCol;
        int teamType = 0;
        ArrayList<Integer> legalMoves = new ArrayList();
         legalMoves.add();
      
		if (teamType == 0)
			System.out.println("yellow:  Make your move.");
		else
			System.out.println("cyan:  Make your move.");
    }
}