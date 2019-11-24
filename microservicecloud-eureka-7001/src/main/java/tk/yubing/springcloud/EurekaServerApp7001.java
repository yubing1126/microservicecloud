package tk.yubing.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author YuBing
 * @version V1.0
 * @description //
 * @package tk.yubing.springcloud
 * @className EurekaServerApp7001
 * @create 2019-11-24 22:29
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApp7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApp7001.class, args);
    }
}
