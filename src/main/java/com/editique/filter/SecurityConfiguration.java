package com.editique.filter;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration 
@Order(1) 
@EnableWebSecurity 
@EnableGlobalMethodSecurity(prePostEnabled = true) 
class SecurityConfiguration extends WebSecurityConfigurerAdapter { 

//    @Override 
//    public void configure(WebSecurity webSecurity) throws Exception { 
//     webSecurity.ignoring().antMatchers("/registration-form"); 
//    } 

    @Override 
    protected void configure(HttpSecurity http) throws Exception { 
     http 
//      .formLogin() 
//       .and() 
   //   .httpBasic().and() 
      .authorizeRequests() 
       .antMatchers("/test").permitAll()
    //   .antMatchers("/editique/*").access("")
       .antMatchers("/editique/*").permitAll();
     ///  .anyRequest().authenticated(); 
    } 
} 
