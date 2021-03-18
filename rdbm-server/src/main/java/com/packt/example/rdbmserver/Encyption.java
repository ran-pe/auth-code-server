package com.packt.example.rdbmserver;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Encyption {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(4);
        String clientSecret = "123456";
        clientSecret = encoder.encode(clientSecret);
        System.out.println(clientSecret);
    }
}
