package dev.yukado.employee.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                // CSRF deaktivieren (falls REST-API ohne Browser-Formulare)
                .csrf(csrf -> csrf.disable())

                // Autorisierung
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/employees/**").authenticated()
                        .anyRequest().permitAll()
                )

                // HTTP Basic Auth aktivieren
                .httpBasic(Customizer.withDefaults());

        return http.build();
    }
}

