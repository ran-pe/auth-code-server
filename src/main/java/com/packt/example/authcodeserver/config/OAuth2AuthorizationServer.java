package com.packt.example.authcodeserver.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;

@Configuration
@EnableAuthorizationServer
public class OAuth2AuthorizationServer extends AuthorizationServerConfigurerAdapter {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.authenticationManager(authenticationManager);
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
//                .withClient("clientapp")
                .withClient("clientadmin")
                .secret("123456")
                .redirectUris("http://localhost:9000/callback")
//                .authorizedGrantTypes("authorization_code")     // 1. code grant 방식
//                .authorizedGrantTypes("implicit")               // 2. implicit(암시적 그랜트) 방식
//                .accessTokenValiditySeconds(120)                // 2. 엑세스 토큰 유효성 검증 시간
//                .authorizedGrantTypes("password")               // 3. password grant 방식
                .authorizedGrantTypes("client_credentials")       // 4. client_credentials 방식
//                .scopes("read_profile", "read_contacts");
                .scopes("admin");                                 // 4. client_credentials 방식
    }


}
