package com.packt.example.rdbmserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *  클라이언트 등록과 관련된 모든 데이터 저장
 */

@Entity
public class oauth_client_details {

    @Id
    @Column(length = 256)
    private String client_id;

    @Column(length = 256)
    private String resource_ids;

    @Column(length = 256)
    private String client_secret;

    @Column(length = 256)
    private String scope;

    @Column(length = 256)
    private String authorized_grant_types;

    @Column(length = 256)
    private String web_server_redirect_uri;

    @Column(length = 256)
    private String authorities;

    @Column
    private Integer access_token_validity;

    @Column
    private Integer refresh_token_validity;

    @Column(length = 4096)
    private String additional_information;

    @Column(length = 256)
    private String autoapprove;

}
