package com.glsywow.app.config;

import org.apache.catalina.connector.Connector;
import org.apache.coyote.http11.Http11NioProtocol;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.stereotype.Component;

@Component
public class MyEmbeddedServletContainerFactory extends TomcatEmbeddedServletContainerFactory {
	@Value("${server.tomcat.max-threads}")
	private String maxThreads;
	@Value("${server.tomcat.max-SpareThreads}")
	private String maxConnections;
	@Value("${server.tomcat.accept-count}")
	private String acceptCount;
      
    @Override
    protected void customizeConnector(Connector connector) {
        super.customizeConnector(connector);  
        Http11NioProtocol protocol = (Http11NioProtocol)connector.getProtocolHandler();
        protocol.setMaxThreads(Integer.valueOf(maxThreads));
        protocol.setMaxConnections(Integer.valueOf(maxConnections));
        protocol.setAcceptCount(Integer.valueOf(acceptCount));
    }  
}
