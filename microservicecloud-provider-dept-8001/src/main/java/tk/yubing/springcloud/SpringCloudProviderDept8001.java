package tk.yubing.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author YuBing
 * @version V1.0
 * @description //
 * @package tk.yubing.springcloud
 * @className SpringCloudProviderDept8001
 * @create 2019-11-21 16:33
 **/
@SpringBootApplication
@EnableEurekaClient
public class SpringCloudProviderDept8001 {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProviderDept8001.class, args);
    }
}
