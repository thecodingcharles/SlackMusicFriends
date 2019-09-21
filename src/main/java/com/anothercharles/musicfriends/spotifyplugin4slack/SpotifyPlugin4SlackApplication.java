package com.anothercharles.musicfriends.spotifyplugin4slack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
@RequestMapping("/musicFriendsOfBase22")
public class SpotifyPlugin4SlackApplication extends WebSecurityConfigurerAdapter {
	    public static void main(String[] args) {
		SpringApplication.run(SpotifyPlugin4SlackApplication.class, args);
	}

		@GetMapping("/nowPlaying")
		public String user() {
			return "nowPlaying";
		}

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http
					.authorizeRequests()
					.antMatchers("/musicFriendsOfBase22").authenticated()
					.anyRequest().permitAll();
		}
}




