package com.alfufinal.harvestmarket.security.enumeration;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@Getter
@RequiredArgsConstructor
public enum Authority implements GrantedAuthority {
    VENDOR("user:update"),
    CUSTOMER("user:update"),
    ADMIN("user:create,user:read,user:update,user:delete");
    private final String value;

    @Override
    public String getAuthority() {
        return this.value;
    }
}
