package com.alfufinal.harvestmarket.security.service;

import com.alfufinal.harvestmarket.dto.UserDto;
import com.alfufinal.harvestmarket.security.domain.Token;
import com.alfufinal.harvestmarket.security.domain.TokenData;
import com.alfufinal.harvestmarket.security.enumeration.TokenType;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.Optional;
import java.util.function.Function;

public interface JwtService {
    String createToken(UserDto userDto, Function<Token, String> tokenFunction);
    Optional<String> extractToken(HttpServletRequest request, String tokenType);
    <T> T getTokenData(String token, Function<TokenData, T> tokenFunction);
    void addCookie(HttpServletResponse response, UserDto userDto, TokenType type);
    void removeCookie(HttpServletRequest request, HttpServletResponse response, String cookieName);
}