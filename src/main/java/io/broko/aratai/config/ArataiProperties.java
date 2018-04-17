package io.broko.aratai.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="aratai")
public class ArataiProperties {

	Map<String,String> users=new HashMap<>();

	public Map<String, String> getUsers() {
		return users;
	}

	public void setUsers(Map<String, String> users) {
		this.users = users;
	}
	
	
}
