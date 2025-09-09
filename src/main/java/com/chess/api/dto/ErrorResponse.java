package com.chess.api.dto;

public class ErrorResponse {
    private final String status = "error";
    private final String message;

    public ErrorResponse(String message) { this.message = message; }

    public String getStatus() { return status; }
    public String getMessage() { return message; }
}
