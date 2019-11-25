package tk.yubing.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import tk.yubing.ribbon.MyRoundRule;
import tk.yubing.ribbon.rule.MyRibbonRule;

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
@RibbonClient(name = "MICROSERVICESPRINGCLOUD-DEPT", configuration = MyRoundRule.class)
public class SpringCloudConsumerDept80 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumerDept80.class, args);
    }
}
