package tk.yubing.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author YuBing
 * @version V1.0
 * @description //
 * @package tk.yubing
 * @className SpringCloudHystrixDashboard9001
 * @create 2019-11-26 19:21
 * @blame
 */
@SpringBootApplication
@EnableHystrixDashboard
public class SpringCloudHystrixDashboard9001 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudHystrixDashboard9001.class, args);
    }
}
