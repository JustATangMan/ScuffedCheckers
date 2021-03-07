package checkers;

public class KingPiece implements Piece{

    private int x, y, team;

    public KingPiece(int xCoord, int yCoord, int teamType) {
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
