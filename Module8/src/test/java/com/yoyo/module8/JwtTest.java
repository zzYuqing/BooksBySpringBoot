package com.yoyo.module8;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtTest {

    @Test
    public void generateJwt(){
        Map<String,Object> claims=new HashMap<>();
        claims.put("id",1);
        claims.put("username","yoyo");

        String jwt= Jwts.builder()
                .addClaims(claims)
                .signWith(SignatureAlgorithm.HS256,"yoyo")
                .setExpiration(new Date(System.currentTimeMillis()+1*60*60*1000))
                .compact();
        System.out.println(jwt);
    }

    @Test
    public void parseJwt(){
        String jwt="eyJhbGciOiJIUzI1NiJ9.eyJpZCI6MSwidXNlcm5hbWUiOiJ5b3lvIiwiZXhwIjoxNzEzMjcwNTU0fQ.JMZx46uq6IDel5KqO50j_C25IX-N3OpBlvQEBS4Ihtk";
        Map<String,Object> claims=Jwts.parser()
                .setSigningKey("yoyo")
                .parseClaimsJws(jwt)
                .getBody();
        System.out.println(claims);
    }
}
