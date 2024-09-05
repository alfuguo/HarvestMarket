package com.alfufinal.harvestmarket.security.domain;
import com.alfufinal.harvestmarket.dto.UserDto;
import io.jsonwebtoken.Claims;
import org.springframework.security.core.GrantedAuthority;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class TokenData {
    private UserDto userDto;
    private Claims claims;
    private boolean valid;
    private List<GrantedAuthority> authorities;
    }