//package com.api.closestuff.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class MyConfig extends WebSecurityConfigurerAdapter{
//	
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		System.out.println("IN Spring security Config");
//		http
//			.csrf().and()
//			.authorizeRequests()
//			.antMatchers(HttpMethod.POST,"/").permitAll()
//			.anyRequest()
//			.authenticated()
//			.and()
//			.formLogin();
//	}
//	
////	@Override
////	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
////		auth.inMemoryAuthentication().withUser("pk").password(this.passwordEncoder().encode("pawan")).roles("NORMAL");
////	}
////	
////	@Bean
////	public PasswordEncoder passwordEncoder() {
////		return new BCryptPasswordEncoder(10);
////	}
//}
