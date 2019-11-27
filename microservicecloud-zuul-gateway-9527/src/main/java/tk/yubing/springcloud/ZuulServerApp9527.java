package tk.yubing.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author YuBing
 * @version V1.0
 * @description //
 * @package tk.yubing.springcloud
 * @className ZuulServerApp9527
 * @create 2019-11-27 10:41
 **/
@SpringBootApplication
@EnableZuulProxy
public class ZuulServerApp9527 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServerApp9527.class, args);
    }
}
