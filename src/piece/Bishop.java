package piece;

import main.GamePanel;
import main.Type;

public class Bishop extends Piece {
    public Bishop(int color, int row, int col) {
        super(color, row, col);

        type = Type.BISHOP;

        if(color == GamePanel.WHITE) {
            image = getImage("/piece/w-bishop");
        }
        else {
            image = getImage("/piece/b-bishop");
        }
    }

    public boolean canMove(int targetCol, int targetRow) {

        if(isWithinBoard(targetCol,targetRow) && isSameSquare(targetCol,targetRow) == false) {

            if(Math.abs(targetCol - preCol) == Math.abs(targetRow - preRow)) {
                if(isValidSquare(targetCol,targetRow) && pieceIsOnStraightLine(targetCol,targetRow) == false) {
                    return true;
                }

            }
        }
        return false;
    }
}
