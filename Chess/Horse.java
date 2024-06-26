package Chess;

public class Horse extends ChessPiece {
    public Horse(String color) {
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
                if ((toLine == line - 2 && toColumn == column + 1) ||
                        (toLine == line - 1 && toColumn == column + 2) ||
                        (toLine == line + 1 && toColumn == column + 2) ||
                        (toLine == line + 2 && toColumn == column + 1) ||
                        (toLine == line + 2 && toColumn == column - 1) ||
                        (toLine == line + 1 && toColumn == column - 2) ||
                        (toLine == line - 1 && toColumn == column - 2) ||
                        (toLine == line - 2 && toColumn == column - 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "H";
    }
}
