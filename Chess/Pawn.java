package Chess;

public class Pawn extends ChessPiece {
    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine >= 0 && toLine <= 7 && toColumn >= 0 && toColumn <= 7) {
            if (line != toLine || column != toColumn) {
                if (((color.equals("White") && line == 1) && (toLine == line + 1 || toLine == line + 2)) || (color.equals("Black") && line == 6) &&
                        (toLine == line - 1 || toLine == line - 2)) {
                    return true;
                } else if (color.equals("White") && toLine == line + 1 || color.equals("Black") && toLine == line - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}
