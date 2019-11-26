package tk.yubing.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author YuBing
 * @version V1.0
 * @description //
 * @package tk.yubing.springcloud
 * @className SpringCloudConsumerDept80
 * @create 2019-11-21 17:47
 * @blame Android Team
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "tk.yubing.springcloud")
public class SpringCloudConsumerDeptFeign {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumerDeptFeign.class, args);
    }
}
