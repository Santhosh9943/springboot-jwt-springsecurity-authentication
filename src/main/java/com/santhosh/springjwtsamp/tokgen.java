package com.santhosh.springjwtsamp;

import java.util.Date;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

public class tokgen {

	public static void main(String[] args) {
		
		String username = "dhatchu";
		int jwtExpirationMs = 600000;
		String jwtSecret = "======================SanthoshM===========================";
		
		
		System.out.println(
		Jwts.builder()
        .setSubject(username)
        .setIssuedAt(new Date())
        .setExpiration(new Date(System.currentTimeMillis() + jwtExpirationMs))
        .signWith(Keys.hmacShaKeyFor(Decoders.BASE64.decode(jwtSecret)))
        .compact()
        );
		
		System.out.println(Keys.hmacShaKeyFor(Decoders.BASE64.decode(jwtSecret)));
  }


}
