package tk.yubing.springcloud.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author YuBing
 * @version V1.0
 * @description //
 * @package tk.yubing.springcloud
 * @className config
 * @create 2019-11-21 17:22
 **/

@Configuration
public class BeanConfig {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
