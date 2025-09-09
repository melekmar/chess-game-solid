package com.chess.api.dto;

import java.util.List;

public class BoardDTO {
    private final int rows;
    private final int cols;
    private final List<SquareDTO> squares;

    public BoardDTO(int rows, int cols, List<SquareDTO> squares) {
        this.rows = rows;
        this.cols = cols;
        this.squares = squares;
    }

    public int getRows() { return rows; }
    public int getCols() { return cols; }
    public List<SquareDTO> getSquares() { return squares; }
}
