package com.app.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.hazelcast.config.ClasspathXmlConfig;
import com.hazelcast.config.Config;

@Configuration
public class HazelcastConfiguration {
	@Bean
	public Config config(Environment environment) {
	    Properties props = new Properties();
	    props.put("hazelcast.group.name", environment.getProperty("hazelcast.group.name"));
	    return new ClasspathXmlConfig("hazelcast.xml", props);
	}
}