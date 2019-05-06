package org.apache.dubbo.samples.provider;
 
import org.apache.dubbo.samples.api.GreetingService;
 
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
