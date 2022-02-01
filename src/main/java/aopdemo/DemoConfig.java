package aopdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy  // can use proxies for calling these target objects
@ComponentScan("aopdemo")  // telling this configuration where to go and scan spring beans or spring components
public class DemoConfig {

}
