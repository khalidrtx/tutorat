/*
 * package com.example.demo.security;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.authentication.AuthenticationManager; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity;
 * 
 * import org.springframework.security.core.userdetails.UserDetailsService;
 * import org.springframework.security.crypto.password.PasswordEncoder; import
 * org.springframework.security.web.authentication.
 * UsernamePasswordAuthenticationFilter;
 * 
 * @Configuration
 * 
 * @EnableWebSecurity public class SecurityConfig extends
 * WebSecurityConfigurerAdapter {
 * 
 * @Autowired private UserDetailsService userDetailsService;
 * 
 * @Autowired private JwtUtil jwtUtil;
 * 
 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
 * Exception {
 * auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder()
 * ); }
 * 
 * @Bean
 * 
 * @Override public AuthenticationManager authenticationManagerBean() throws
 * Exception { return super.authenticationManagerBean(); }
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception { http
 * // Disable form login as we're using JWT .disableFormLogin()
 * .authorizeRequests() .antMatchers("/login", "/index",
 * "/register").permitAll() .anyRequest().authenticated() .and() // Stateless
 * API authentication using JWT filter .addFilterBefore(new
 * JwtAuthenticationFilter(authenticationManagerBean(), jwtUtil),
 * UsernamePasswordAuthenticationFilter.class)
 * .sessionManagement().sessionCreationPolicy(SessionManagementConfigurer.
 * SessionCreationPolicy.STATELESS); }
 * 
 * @Bean public PasswordEncoder passwordEncoder() { return new
 * BCryptPasswordEncoder(); } }
 */