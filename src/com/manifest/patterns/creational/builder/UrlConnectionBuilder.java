package com.manifest.patterns.creational.builder;

public class UrlConnectionBuilder {

	private String protocol;
	private String host;
	private int port;
	private String username;
	private String password;

	public UrlConnectionBuilder withProtocol(String protocol) {
		this.protocol = protocol;
		return this;
	}
	public UrlConnectionBuilder withHost(String host) {
		this.host = host;
		return this;
	}
	
	public UrlConnectionBuilder withPort(int port) {
		this.port = port;
		return this;
	}
	
	public UrlConnectionBuilder withCredentials(String username, String password) {
		this.username = username;
		this.password = password;
		return this;
	}
	
	public UrlConnection build() {
		return new UrlConnection(protocol, host, port, username, password);
	}
}
