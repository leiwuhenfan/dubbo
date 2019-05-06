package org.apache.dubbo.demo.provider;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;
import org.apache.dubbo.samples.api.GreetingService;
import org.apache.dubbo.samples.provider.GreetingServiceImpl;

import java.io.IOException;

public class Application {

	public static void main(String[] args) throws IOException {
		ServiceConfig<GreetingService> serviceConfig = new ServiceConfig<GreetingService>();
		serviceConfig.setApplication(new ApplicationConfig("first-dubbo-provider"));
		serviceConfig.setRegistry(new RegistryConfig("zookeeper://192.168.0.59:2181"));
		serviceConfig.setInterface(GreetingService.class);
		serviceConfig.setRef(new GreetingServiceImpl());
		serviceConfig.export();
		System.in.read();
	}
}
