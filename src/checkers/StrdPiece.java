package checkers;

public class StrdPiece implements Piece{

    private int x, y, team;

    public StrdPiece(int xCoord, int yCoord, int teamType) {
        x = xCoord;
        y = yCoord;
        team = teamType;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getTeam() {
        return team;
    }
}
