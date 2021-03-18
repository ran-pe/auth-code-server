INSERT INTO oauth_client_details
(client_id, resource_ids, client_secret, scope, authorized_grant_types, web_server_redirect_uri, authorities,
 access_token_validity, refresh_token_validity, additional_information, autoapprove)
values ('clientapp', null, '$2a$04$akhdybnFkrzsiqwHt9ybEODHITrDjBD2b2bGWjogy5xPiz5/oNkqG', 'read_profile, read_posts', 'authorization_code',
        'http://localhost:9000:/callback', null, 3000, -1, null, 'false');