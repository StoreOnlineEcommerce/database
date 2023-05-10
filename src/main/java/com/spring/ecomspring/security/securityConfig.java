package com.spring.ecomspring.security;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class securityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected  void configure(HttpSecurity http) throws  Exception{

        http.authorizeRequests()
                .antMatchers("/api", "/api/Holamundo").permitAll()
                .anyRequest().authenticated()
                .and().formLogin()
                .and().httpBasic();
    }
}
