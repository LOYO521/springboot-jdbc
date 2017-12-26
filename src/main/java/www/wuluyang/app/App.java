package www.wuluyang.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages={"www.wuluyang.Controller","www.wuluyang.service"})
//@ComponeScan扫描包范围
@EnableAutoConfiguration
public class App {
public static void main(String[] args) {
	SpringApplication.run(App.class, args);
}
}
