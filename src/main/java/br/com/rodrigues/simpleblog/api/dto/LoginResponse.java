package br.com.rodrigues.simpleblog.api.dto;

public record LoginResponse(String accessToken, Long expiresIn) {
}
