/*
 * package com.example.configuration;
 * 
 * import javax.sql.DataSource;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.authentication.AuthenticationManager; import
 * org.springframework.security.crypto.password.PasswordEncoder; import
 * org.springframework.security.oauth2.config.annotation.configurers.
 * ClientDetailsServiceConfigurer; import
 * org.springframework.security.oauth2.config.annotation.web.configuration.
 * AuthorizationServerConfigurer; import
 * org.springframework.security.oauth2.config.annotation.web.configurers.
 * AuthorizationServerEndpointsConfigurer; import
 * org.springframework.security.oauth2.config.annotation.web.configurers.
 * AuthorizationServerSecurityConfigurer; import
 * org.springframework.security.oauth2.provider.token.TokenStore; import
 * org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;
 * 
 * @Configuration public class AuthServerSecurityConfigure implements
 * AuthorizationServerConfigurer {
 * 
 * @Autowired PasswordEncoder passwordEncode;
 * 
 * @Autowired DataSource dataSource;
 * 
 * @Autowired AuthenticationManager AuthenticationManager;
 * 
 * @Bean TokenStore jdbcTokenStore() { return new JdbcTokenStore(dataSource); }
 * 
 * @Override public void configure(AuthorizationServerSecurityConfigurer
 * security) throws Exception {
 * 
 * security.checkTokenAccess("isAuthenticated()").tokenKeyAccess("permitAll()");
 * 
 * }
 * 
 * @Override public void configure(ClientDetailsServiceConfigurer clients)
 * throws Exception { clients.jdbc(dataSource).passwordEncoder(passwordEncode);
 * 
 * }
 * 
 * @Override public void configure(AuthorizationServerEndpointsConfigurer
 * endpoints) throws Exception { // TODO Auto-generated method stub
 * endpoints.tokenStore(jdbcTokenStore());
 * endpoints.authenticationManager(AuthenticationManager);
 * 
 * }
 * 
 * 
 * }
 */