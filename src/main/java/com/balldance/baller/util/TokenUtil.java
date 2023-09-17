package com.balldance.baller.util;

import com.balldance.baller.model.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TokenUtil {
    private static final String SECRET = "YYLX&BALLDANCE&NOBODYSEETHISKEY";

    public static String generateToken(User user) {
        Map<String, Object> claims = new HashMap<String, Object>();
        claims.put("sub", user.getUsrName());
        claims.put("created", TimeUtil.getTime());
        return generateToken(claims);
    }

    /**
     * 根据 claims 生成 Token
     *
     * @param claims
     * @return
     */
    private static String generateToken(Map<String, Object> claims) {
        return Jwts.builder()
            .setClaims(claims)
            .setExpiration(new Date(System.currentTimeMillis() + 30 * 1000))
            .signWith(SignatureAlgorithm.HS512, SECRET.getBytes(StandardCharsets.UTF_8))
            .compact();
    }
}
