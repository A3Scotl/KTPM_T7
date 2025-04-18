package iuh.fit.se.gatewayservice.utils;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtTokenGenerator {

    @Value("${jwt.secret}")
    private String jwtSecret;

    public String generateToken(String subject) {
        return Jwts.builder()
                .setSubject(subject) // User information
                .setIssuedAt(new Date()) // Token creation time
                .setExpiration(new Date(System.currentTimeMillis() + 3600000)) // Token expiration (1 hour)
                .signWith(SignatureAlgorithm.HS256, jwtSecret.getBytes()) // Sign with the secret key
                .compact();
    }
}