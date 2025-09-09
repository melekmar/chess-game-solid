// src/main/java/com/chess/controller/ChessController.java
package com.chess.controller;

import com.chess.api.dto.BoardDTO;
import com.chess.api.dto.MoveRequest;
import com.chess.api.dto.MoveResponse;
import com.chess.api.dto.SquareDTO;
import com.chess.model.Move;
import com.chess.model.Piece;
import com.chess.service.IGameService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/chess")
public class ChessController {

    private final IGameService IGameService;

    public ChessController(IGameService IGameService) {
        this.IGameService = IGameService;
    }

    @GetMapping("/board")
    public BoardDTO getBoard() {
        Piece[][] grid = IGameService.getBoardState();
        List<SquareDTO> squares = new ArrayList<>(64);
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                Piece p = grid[r][c];
                squares.add(new SquareDTO(
                        r, c,
                        p == null ? null : p.getColor(),
                        p == null ? null : p.getType()
                ));
            }
        }
        return new BoardDTO(8, 8, squares);
    }

    @PostMapping("/move")
    public MoveResponse movePiece(@RequestBody MoveRequest req) {
        IGameService.move(req.getFromRow(), req.getFromCol(), req.getToRow(), req.getToCol());
        return new MoveResponse(
                "success",
                "Move completed successfully.",
                IGameService.getCurrentPlayer(),
                IGameService.isGameOver(),
                IGameService.getWinner()
        );
    }

    @GetMapping("/history")
    public List<String> getMoveHistory() {
        return IGameService.getMoveHistory().stream().map(Move::getNotation).toList();
    }

    @PostMapping("/reset")
    public String resetGame() {
        IGameService.resetMatch();
        return "Game reset successfully.";
    }
}
