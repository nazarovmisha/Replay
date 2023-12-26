package Chess;

public class Queen extends ChessPiece {
    public Queen(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine >= 0 && toLine <= 7 && toColumn >= 0 && toColumn <= 7) {
            if (line != toLine && column != toColumn) {
                if (Math.abs(toColumn - column) == Math.abs(toLine - line)) {
                    return true;
                }else  if (toLine == line && toColumn != column) {
                    return true;
                } else if
                (toLine != line && toColumn == column) {
                    return true;
                }
            }
        }return false;
    }

    @Override
    public String getSymbol() {
        return "Q";
    }
}
