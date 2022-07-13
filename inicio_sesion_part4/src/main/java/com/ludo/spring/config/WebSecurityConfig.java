package com.ludo.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		String encodedAdmin=new BCryptPasswordEncoder().encode("admin@123");
	    System.out.println("admin@123: " + encodedAdmin);
	    String encodedUser=new BCryptPasswordEncoder().encode("user1Pass");
	    System.out.println("user1Pass: " + encodedUser);
		
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests().anyRequest().hasAnyRole("ADMIN", "USER").and().authorizeRequests()
//				.antMatchers("/login**").permitAll().and().formLogin().loginPage("/login")
//				.loginProcessingUrl("/autorizado").permitAll().and().logout().logoutSuccessUrl("/login").permitAll()
//				.and().csrf().disable();
		http.authorizeRequests()
		.antMatchers("/", "/index").hasAnyRole("ADMIN", "USER")
		.antMatchers("/admin/**", "/admin").hasRole("ADMIN")
		.and().formLogin().loginPage("/login").loginProcessingUrl("/autorizado").permitAll()
		.and().logout().permitAll()
		.and().exceptionHandling().accessDeniedPage("/forbidden");
	}

}
