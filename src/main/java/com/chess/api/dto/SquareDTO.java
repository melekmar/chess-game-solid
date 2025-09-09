package com.chess.api.dto;

public class SquareDTO {
    private final int row;
    private final int col;
    private final String color;
    private final String pieceType;

    public SquareDTO(int row, int col, String color, String pieceType) {
        this.row = row;
        this.col = col;
        this.color = color;
        this.pieceType = pieceType;
    }

    public int getRow() { return row; }
    public int getCol() { return col; }
    public String getColor() { return color; }
    public String getPieceType() { return pieceType; }
}
