package com.packt.example.rdbmserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 발급된 엑세스 토큰을 저장
 */

@Entity
public class oauth_access_token {


    @Column(length = 256)
    private String token_id;

    @Column(columnDefinition = "BINARY")
    private Long token;

    @Id
    @Column(length = 256)
    private String authentication_id;

    @Column(length = 256)
    private String user_name;

    @Column(length = 256)
    private String client_id;

    @Column(columnDefinition = "BINARY")
    private Long authentication;

    @Column(length = 256)
    private String refresh_token;

}
