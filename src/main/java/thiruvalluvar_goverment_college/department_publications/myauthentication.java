package thiruvalluvar_goverment_college.department_publications;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class myauthentication {

    @Bean
    public PasswordEncoder coder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsservice() {
        UserDetails myUser1 = User.withUsername("admin").password(coder().encode("collegeadmin")).roles("USER")
                .build();
        UserDetails myUser2 = User.withUsername("professor").password(coder().encode("collegeprofessor")).roles("USER")
                .build();

        return new InMemoryUserDetailsManager(myUser1, myUser2);
    }

    @Bean
    public SecurityFilterChain prabakaran(HttpSecurity hp) throws Exception {
        hp
                .authorizeHttpRequests()
                .requestMatchers("/department_publications/*")
                .authenticated();
        hp.csrf().disable();
        hp.cors();
        hp.formLogin();
        hp.httpBasic();

        return hp.build();
    }
}
