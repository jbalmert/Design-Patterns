package com.manifest.patterns.creational.builder;

public class UrlConnectionClient {

	public void createClient() {
		UrlConnection connection = new UrlConnectionBuilder()
				.withProtocol("https")
				.withHost("manifestcorp.com")
				.withPort(443)
				.withCredentials("scott", "tiger")
				.build();
	}
}
