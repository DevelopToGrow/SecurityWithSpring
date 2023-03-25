/**
 * 
 */
package com.java.knowledge.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

/**
 * @author Viraj Bansode
 *
 * 12-Mar-2023
 */

@Configuration
@EnableWebSecurity
public class SecurityConfig{

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(config ->{
			config.requestMatchers("/","/public/**").permitAll();
			config.requestMatchers("/home").hasAnyRole("admin","");
			config.anyRequest().authenticated();
		}).formLogin().and().httpBasic();
		return http.build();
	}
	
	 @Bean
	    public WebSecurityCustomizer webSecurityCustomizer() {
	        return (web) -> web.ignoring().requestMatchers("/images/**", "/pages/**");
	    }
	
	
	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails user =
			 User.withDefaultPasswordEncoder()
				.username("user")
				.password("pass")
				.roles("user")
				.build();
		
		UserDetails user2 =
				 User.withDefaultPasswordEncoder()
					.username("admin")
					.password("pass")
					.roles("admin")
					.build();

		return new InMemoryUserDetailsManager(user,user2);
	}
}
