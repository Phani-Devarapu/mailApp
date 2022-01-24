package com.phani.message.app;

import java.io.File;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="datastax.astra")
public class DataStaxAstraProperties {
	
	private File secureConnectMyCassaandra;

	public File getSecureConnectMyCassaandra() {
		return secureConnectMyCassaandra;
	}

	public void setSecureConnectMyCassaandra(File secureConnectMyCassaandra) {
		this.secureConnectMyCassaandra = secureConnectMyCassaandra;
	}
}
