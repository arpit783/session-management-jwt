package com.sessionManagement.JWT.JWTUtils.Models;

import java.io.Serializable;

public class JwtResponseModel implements Serializable {
    private static final long serialVersionUID = 1L;
    private String token;

    public JwtResponseModel(String token){
        this.token = token;
    }

    public String getToken(){
        return token;
    }
}
