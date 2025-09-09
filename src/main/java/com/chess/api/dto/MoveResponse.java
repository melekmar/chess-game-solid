package com.chess.api.dto;

public class MoveResponse {
    private String status;
    private String message;
    private String nextPlayer;
    private boolean gameOver;
    private String winner;

    public MoveResponse(String status, String message, String nextPlayer, boolean gameOver, String winner) {
        this.status = status;
        this.message = message;
        this.nextPlayer = nextPlayer;
        this.gameOver = gameOver;
        this.winner = winner;
    }

    public String getStatus() { return status; }
    public String getMessage() { return message; }
    public String getNextPlayer() { return nextPlayer; }
    public boolean isGameOver() { return gameOver; }
    public String getWinner() { return winner; }
}
