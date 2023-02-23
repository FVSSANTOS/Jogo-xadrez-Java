package boardgame;

public class Board {
    
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns){
        this.columns = columns;
        this.rows = rows;
        pieces = new Piece[rows][columns];
    }

    public int getColumns() {
        return columns;
    }
    public void setColumns(int columns) {
        this.columns = columns;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }
    public int getRows() {
        return rows;
    }
    
}