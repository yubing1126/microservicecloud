package tk.yubing.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author YuBing
 * @version V1.0
 * @description //
 * @package tk.yubing.springcloud
 * @className ConfigServerApp3344
 * @create 2019-11-27 16:05
 **/

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApp3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApp3344.class, args);
    }
}
