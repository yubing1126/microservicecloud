package tk.yubing.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author YuBing
 * @version V1.0
 * @description //
 * @package tk.yubing.springcloud
 * @className ConfigEurekaApp7001
 * @create 2019-11-27 18:25
 **/
@SpringBootApplication
@EnableEurekaServer
public class ConfigEurekaApp7001 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigEurekaApp7001.class, args);
    }
}
