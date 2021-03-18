package com.packt.example.rdbmserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * 사용자 승인 저장
 */

@Entity
public class oauth_approvals {

    @Id
    @Column(columnDefinition = "BINARY(16)")
    private UUID uuid;

    @Column(length = 256)
    private String userId;

    @Column(length = 256)
    private String clientId;

    @Column(length = 256)
    private String scope;

    @Column(length = 10)
    private String status;

    @Column
    private LocalDateTime expiresAt;

    @Column
    private LocalDateTime lastModifiedAt;

}
