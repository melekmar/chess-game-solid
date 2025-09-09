package com.chess.service;

import com.chess.model.Move;
import com.chess.model.Piece;
import java.util.List;

public interface IGameService {
    boolean move(int fromRow, int fromCol, int toRow, int toCol);
    Piece[][] getBoardState();
    String getCurrentPlayer();
    boolean isGameOver();
    String getWinner();
    List<Move> getMoveHistory();
    void resetMatch();
}