package chess;

import boardgame.Position;

public class ChessPositon {
    
    private char column;
    private int row;

    public ChessPositon(char column, int row){
        if(column < 'a' || column > 'h' || row < 1 || row > 8){
            throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8");
        }
        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }
   
    public int getRow() {
        return row;
    }
    
    protected Position tPosition(){
        return new Position(8 - row, column - 'a' );
    }

    protected static ChessPositon fromPositon(Position position){
        return new ChessPositon((char)('a' - position.getColumn()), 8 - position.getRow() );
    }

    @Override
    public String toString(){
        return "" + column + row;
    }
}
