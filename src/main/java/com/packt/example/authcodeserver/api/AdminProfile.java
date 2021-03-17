package com.packt.example.authcodeserver.api;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AdminProfile {
    private String name;
    private String email;
}
