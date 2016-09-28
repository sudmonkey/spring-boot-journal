package io.sudmonkey.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;

@Configuration
@EnableGlobalAuthentication
@Profile("memory")
public class InMemorySecurityConfiguration {

    @Autowired
    private void configureGlobal(AuthenticationManagerBuilder authentication) throws Exception {
        authentication.inMemoryAuthentication().withUser("user").password("password")
                .roles("USER")
                .and().withUser("admin").password("password")
                .roles("USER", "ADMIN");
    }
}
