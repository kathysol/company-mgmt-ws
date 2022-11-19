package com.sicpa.companymgmt.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {
    @Value("${spring.security.secure-key-username}")
    private  String secureKeyUsername;

    @Value("${spring.security.secure-key-password}")
    private  String secureKeyPassword;

    @Value("${spring.security.secure-key-username-2}")
    private  String secureKeyUsername2;

    @Value("${spring.security.secure-key-password-2}")
    private  String secureKeyPassword2;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        AuthenticationManagerBuilder authenticationManagerBuilder = http.getSharedObject(
                AuthenticationManagerBuilder.class
        );
        authenticationManagerBuilder.inMemoryAuthentication()
                .withUser(secureKeyUsername)
                .password(new BCryptPasswordEncoder().encode(secureKeyPassword))
                .authorities(AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_ADMIN"))
                .and()
                .withUser(secureKeyUsername2)
                .password(new BCryptPasswordEncoder().encode(secureKeyPassword2))
                .authorities(AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_DEV"))
                .and()
                .passwordEncoder(new BCryptPasswordEncoder());
        return http.antMatcher("/**")
                .authorizeRequests()
                .anyRequest().hasRole("ADMIN").and().csrf().disable().httpBasic().and().build();


    }
    }

