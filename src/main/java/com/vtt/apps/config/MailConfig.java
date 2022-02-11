package com.vtt.apps.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MailConfig {
	@Value("smtp.gmail.com")
	private String host;
	@Value("port")
	private String port;
	@Value("spring.mail.username")
	private String userName;
	@Value("spring.mail.password")
	private String password;
	
}
