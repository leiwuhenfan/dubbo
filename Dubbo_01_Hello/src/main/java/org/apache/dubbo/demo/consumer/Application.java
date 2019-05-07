package org.apache.dubbo.demo.consumer;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.samples.api.GreetingService;

public class Application {
    public static void main(String[] args) {
    	ReferenceConfig<GreetingService> referenceConfig = new ReferenceConfig<GreetingService>();
        referenceConfig.setApplication(new ApplicationConfig("first-dubbo-consumer"));
        //multicast://224.5.6.7:1234
		referenceConfig.setRegistry(new RegistryConfig("zookeeper://192.168.0.78:2181"));
        referenceConfig.setInterface(GreetingService.class);
        GreetingService greetingService = referenceConfig.get();
        System.out.println(greetingService.sayHello(" 仲少(zhongshao)"));
    }
}