//package com.inti.formation.util;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(securedEnabled=true)
//public class Securityconfig extends WebSecurityConfigurerAdapter{
//
//	
//	
//	
//	@Autowired
//	public void globalconfi(AuthenticationManagerBuilder auth,
//			DataSource dataSource) throws Exception{
////		auth
////		.inMemoryAuthentication()
////		.withUser("admin")
////		.password("{noop}1234")
////		.roles("ADMIN");
//		
//		auth
//		.jdbcAuthentication()
//		.dataSource(dataSource)
//		.usersByUsernameQuery("select username as principal, password as credentials, true from personne where username=?")
//		.authoritiesByUsernameQuery("select username as principal, role as role from personne where username=?")
//		.passwordEncoder(NoOpPasswordEncoder.getInstance())
//		.rolePrefix("ROLE_");
//		
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http
//		.authorizeRequests()
//		.anyRequest()
//		.authenticated()
//		.and()
//		.formLogin()
//		.loginPage("/login")
//		.permitAll()
//		.defaultSuccessUrl("/accueil")
//		.and()
//		.exceptionHandling()
//		.accessDeniedPage("/error");
//
//	}
//}
