// src/main/java/com/chess/service/GameService.java
package com.chess.service;

import com.chess.model.Match;
import com.chess.model.Move;
import com.chess.model.Piece;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    private Match match = new Match();

    public boolean move(int fromRow, int fromCol, int toRow, int toCol) {
        return match.move(fromRow, fromCol, toRow, toCol);
    }

    public Piece[][] getBoardState() {
        return match.getBoard().getGrid();
    }

    public String getCurrentPlayer() {
        return match.getCurrentPlayer().getColor();
    }

    // >>> add these <<<
    public boolean isGameOver() {
        return match.isGameOver();
    }

    public String getWinner() {
        return match.getWinner();
    }

    public List<Move> getMoveHistory() {
        return match.getMoveHistory();
    }
    // <<< add these <<<

    public void resetMatch() {
        this.match = new Match();
    }
}


