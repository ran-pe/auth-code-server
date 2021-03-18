package com.packt.example.rdbmserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * 리프레시 토큰 발급 테이블
 */

@Entity
public class oauth_refresh_token {

    @Id
    @Column(columnDefinition = "BINARY(16)")
    private UUID uuid;

    @Column(length = 256)
    private String token_id;

    @Column(columnDefinition = "BINARY")
    private Long token;

    @Column(columnDefinition = "BINARY")
    private Long authentication;

}
